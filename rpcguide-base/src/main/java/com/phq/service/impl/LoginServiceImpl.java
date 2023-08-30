package com.phq.service.impl;

import com.phq.domain.ResponseResult;
import com.phq.domain.entity.LoginUserDetails;
import com.phq.domain.entity.User;
import com.phq.domain.vo.LoginUserVo;
import com.phq.domain.vo.LoginVo;
import com.phq.service.LoginService;
import com.phq.utils.BeanCopyUtils;
import com.phq.utils.JwtUtil;
import com.phq.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * 用户登陆服务层
 * login
 *
 * @author: phq
 * @date: 2023/8/19
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private RedisCache redisCache;

    @Override
    public ResponseResult login(User user) {
        //用 spring security 里的 认证管理器 校验，得到含userDetail的authenticate
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword());
        Authentication authenticate =
                authenticationManager.authenticate(authenticationToken);

        //判断是否认证通过
        if(Objects.isNull(authenticate)){
            throw new RuntimeException("用户名或密码错误");
        }

        //认证通过。获取uid，生成token
        LoginUserDetails loginUserDetails = (LoginUserDetails) authenticate.getPrincipal();
        String uid = loginUserDetails.getUser().getUId().toString();
        String jwt = JwtUtil.createJWT(uid);

        //把uid和loginUserDetails存入redis
        redisCache.setCacheObject("login:"+uid, loginUserDetails);
        //把token和user转换成LoginVo
        LoginUserVo loginUserVo = BeanCopyUtils.copyBean(loginUserDetails.getUser(), LoginUserVo.class);
        LoginVo loginVo = new LoginVo(jwt, loginUserVo);

        //封装成ResponseResult返回
        return ResponseResult.okResult(loginVo);
    }

    @Override
    public ResponseResult logout() {
        //获取token 解析获取userid
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LoginUserDetails loginUserDetails = (LoginUserDetails) authentication.getPrincipal();
        //获取userid
        Integer uId = loginUserDetails.getUser().getUId();
        //删除redis中的用户信息
        redisCache.deleteObject("login:" + uId);

        return ResponseResult.okResult();
    }
}
