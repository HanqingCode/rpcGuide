package com.phq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.phq.domain.ResponseResult;
import com.phq.domain.entity.User;
import com.phq.domain.vo.UserProfileVo;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2023-08-24 19:30:02
 */
public interface UserService extends IService<User> {

    ResponseResult userProfile();

    ResponseResult userProgress();

    ResponseResult userProfile(String id);

    ResponseResult userProgress(String id);

    ResponseResult updateUserProfile(UserProfileVo userProfileVo);
}

