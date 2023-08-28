package com.phq.domain.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (Question)表实体类
 *
 * @author makejava
 * @since 2023-08-24 18:52:35
 */
@Data
@TableName("question")
public class Question {
    
    private Integer queId;
    
    private Integer testId;
    
    private Integer type;
    
    private String question;
    
    private Integer numOfOpt;
    
    private String correctOpt;
    
    private String explanation;
    
    private Date createdAt;
    
    private Integer isDeleted;


}

