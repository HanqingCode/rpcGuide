package com.phq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.phq.dao.UserDao;
import com.phq.domain.entity.LoginUserDetails;
import com.phq.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author: phq
 * @date: 2023/8/19
 */

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String userame) throws UsernameNotFoundException {
        //根据用户名username查询出用户user
        LambdaQueryWrapper<User> userWrapper = new LambdaQueryWrapper<>();
        userWrapper.eq(User::getUsername, userame);
        User user = userDao.selectOne(userWrapper);

        //判断是否查询出用户user
        if(Objects.isNull(user)){
            throw new RuntimeException("用户不存在");
        }

        //把user封装成LoginUserDetails并返回
        return new LoginUserDetails(user);
    }
}
