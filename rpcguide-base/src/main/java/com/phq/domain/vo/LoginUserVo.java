package com.phq.domain.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author: phq
 * @date: 2023/8/19
 */
@Data
public class LoginUserVo {
    private Integer uId;

    private String username;

    private String phone;

    private String email;

    private String picture;


}
