package com.phq.domain.vo;

import lombok.Data;

/**
 * @author: phq
 * @date: 2023/8/30
 */

@Data
public class UserProfileVo {
    private Integer uId;

    private String username;

    private String phone;

    private String email;

    private String picture;


    //
    private Integer age;

    private String gender;

    private String address;

    private String occupation;

    private String major;

    private Integer yearsOfExp;

    private Integer skillDegree;

    private Integer targetDegree;
}
