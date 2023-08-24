package com.phq.controller;

import com.phq.domain.ResponseResult;
import com.phq.domain.entity.User;
import com.phq.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户登陆控制层
 * login
 *
 * @author: phq
 * @date: 2023/8/19
 */

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * 用户登陆
     * login
     * @param user
     * @return
     */
    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user){
        return loginService.login(user);
    }




}
