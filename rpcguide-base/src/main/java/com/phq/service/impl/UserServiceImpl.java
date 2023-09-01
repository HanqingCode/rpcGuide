package com.phq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phq.dao.UserDao;
import com.phq.dao.UserProfileDao;
import com.phq.dao.UserProgressDao;
import com.phq.domain.ResponseResult;
import com.phq.domain.entity.User;
import com.phq.domain.entity.UserProfile;
import com.phq.domain.entity.UserProgress;
import com.phq.domain.vo.UserProfileVo;
import com.phq.domain.vo.UserProgressVo;
import com.phq.service.UserService;
import com.phq.utils.BeanCopyUtils;
import com.phq.utils.SecurityUtils;
import org.apache.catalina.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2023-08-24 19:30:02
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Autowired
    private UserProfileDao userProfileDao;
    @Autowired
    private UserProgressDao userProgressDao;


    /**
     * 用户信息查询userProfile - 查询用户信息 （带token）
     * query user profile
     *
     * @return 所有数据
     */
    @Override
    public ResponseResult userProfile() {
        //获取userid
        Integer uId = SecurityUtils.getUserId();
        //根据uid查询user
        User user = getById(uId);
        //根据uid查询userProfile
        UserProfile userProfile = userProfileDao.selectById(uId);
        //封装
        UserProfileVo userProfileVo = BeanCopyUtils.copyBeanTwo(user, userProfile, UserProfileVo.class);

        //返回
        return ResponseResult.okResult(userProfileVo);
    }



    /**
     * 用户进度查询userProgress - 查询用户课程进度 （带token）
     * query user progress
     *
     * @return 所有数据
     */
    @Override
    public ResponseResult userProgress() {
        //获取userid
        Integer uId = SecurityUtils.getUserId();
        //根据uid查询user
        //User user = getById(uId);
        //根据uid查询userProgress
        UserProgress userProgress = userProgressDao.selectById(uId);
        //封装
        UserProgressVo userProgressVo = BeanCopyUtils.copyBean(userProgress, UserProgressVo.class);

        //返回
        return ResponseResult.okResult(userProgressVo);
    }




    /**
     * 用户信息查询userProfile - 查询用户信息 （不带token）
     * query user profile
     *
     * @return 所有数据
     */
    @Override
    public ResponseResult userProfile(String id) {
        //根据uid查询user
        User user = getById(id);
        //根据uid查询userProfile
        UserProfile userProfile = userProfileDao.selectById(id);
        //封装
        UserProfileVo userProfileVo = BeanCopyUtils.copyBeanTwo(user, userProfile, UserProfileVo.class);
        //返回
        return ResponseResult.okResult(userProfileVo);
    }


    /**
     * 用户进度查询userProgress - 查询用户课程进度 （不带token）
     * query user progress
     *
     * @return 所有数据
     */
    @Override
    public ResponseResult userProgress(String id) {
        //根据uid查询user
        //User user = getById(uId);
        //根据uid查询userProgress
        UserProgress userProgress = userProgressDao.selectById(id);
        //封装
        UserProgressVo userProgressVo = BeanCopyUtils.copyBean(userProgress, UserProgressVo.class);
        //返回
        return ResponseResult.okResult(userProgressVo);
    }


    /**
     * 用户信息修改updateUserProfile - 修改用户信息 （不带token）
     * update UserProfile
     *
     * @return 所有数据
     */
    @Override
    public ResponseResult updateUserProfile(UserProfileVo userProfileVo) {
        //把前端传来的所有信息userProfileVo封装到user和userProfile
        User user = BeanCopyUtils.copyBean(userProfileVo, User.class);
        UserProfile userProfile = BeanCopyUtils.copyBean(userProfileVo, UserProfile.class);
        //把user和userProfile更新到数据库
        updateById(user);
        userProfileDao.updateById(userProfile);
        //返回
        return ResponseResult.okResult();
    }

}

