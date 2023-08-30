package com.phq.domain.entity;

import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (UserTest)表实体类
 *
 * @author makejava
 * @since 2023-08-30 01:33:06
 */
@Data
@TableName("user_test")
public class UserTest {
    @TableId
    private Integer utestId;
    
    private Integer uId;
    
    private Integer testId;
    
    private Integer score;
    
    private JSON result;
    
    private Date createdAt;
    
    private Integer isDeleted;


}

