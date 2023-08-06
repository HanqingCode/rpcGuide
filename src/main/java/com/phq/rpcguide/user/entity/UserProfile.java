package com.phq.rpcguide.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: phq
 * @date: 2023/8/3
 */

@Data
@TableName("user_profile")
public class UserProfile {
    private Integer uID;

    private Integer age;

    private String gender;

    private String address;

    private String phone;

    private String email;

    private String picture;

    private String occupation;

    private String major;

    private Integer yearsOfExp;

    private Integer skillLevel;

    private Integer target;
}
