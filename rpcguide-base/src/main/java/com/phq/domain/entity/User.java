package com.phq.domain.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2023-08-19 13:15:49
 */
@Data
@TableName("user")
public class User {
    @TableId
    private Integer uId;
    
    private Integer isAdmin;
    
    private String username;
    
    private String password;
    
    private String phone;
    
    private String email;

    private String picture;
    
    private Date createdAt;
    
    private Integer isDeleted;


}

