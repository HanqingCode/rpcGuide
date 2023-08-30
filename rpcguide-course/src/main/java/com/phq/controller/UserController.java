package com.phq.controller;

/**
 * @author: phq
 * @date: 2023/8/30
 */

import com.phq.domain.ResponseResult;
import com.phq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户登陆控制层
 * login
 *
 * @author: phq
 * @date: 2023/8/19
 */

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户信息查询userProfile - 查询用户信息
     * query user profile
     *
     * @return 所有数据
     */
    @GetMapping("/profile")
    public ResponseResult userProfile(){
        return userService.userProfile();
    }


    /**
     * 用户进度查询userProgress - 查询用户课程进度
     * query user progress
     *
     * @return 所有数据
     */
    @GetMapping("/progress")
    public ResponseResult userProgress(){
        return userService.userProgress();
    }





}
