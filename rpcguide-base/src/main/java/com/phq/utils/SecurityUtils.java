package com.phq.utils;

import com.phq.domain.entity.LoginUserDetails;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtils
{

    /**
     * 获取用户
     **/
    public static LoginUserDetails getLoginUser()
    {
        return (LoginUserDetails) getAuthentication().getPrincipal();
    }

    /**
     * 获取Authentication
     */
    public static Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public static Boolean isAdmin(){
        Integer uId = getLoginUser().getUser().getUId();
        return uId != null && uId.equals(1L);
    }

    public static Integer getUserId() {
        return getLoginUser().getUser().getUId();
    }
}