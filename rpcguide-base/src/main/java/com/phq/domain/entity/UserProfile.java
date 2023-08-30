package com.phq.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (UserProfile)表实体类
 *
 * @author makejava
 * @since 2023-08-30 19:40:22
 */
@Data
@TableName("user_profile")
public class UserProfile {
    @TableId
    private Integer uId;
    
    private Integer age;
    
    private String gender;
    
    private String address;
    
    private String occupation;
    
    private String major;
    
    private Integer yearsOfExp;
    
    private Integer skillDegree;
    
    private Integer targetDegree;


}

