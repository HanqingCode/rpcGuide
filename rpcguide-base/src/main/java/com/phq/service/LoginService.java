package com.phq.service;

import com.phq.domain.ResponseResult;
import com.phq.domain.entity.User;
import org.springframework.stereotype.Service;

/**
 * 用户登陆服务层
 * login
 *
 * @author: phq
 * @date: 2023/8/19
 */


public interface LoginService {
    ResponseResult login(User user);
}
