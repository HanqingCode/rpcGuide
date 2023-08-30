package com.phq.rpcguide.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author: phq
 * @date: 2023/8/3
 */

@Data
@TableName("user")
public class User {
    private Integer uID;

    private String username;

    private String password;

    private Boolean isAdmin;

    private Timestamp createdAt;

    private Boolean isDeleted;
}
