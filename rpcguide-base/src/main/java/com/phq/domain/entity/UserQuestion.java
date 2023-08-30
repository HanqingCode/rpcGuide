package com.phq.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (UserQuestion)表实体类
 *
 * @author makejava
 * @since 2023-08-30 01:35:07
 */
@Data
@TableName("user_question")
public class UserQuestion {
    @TableId
    private Integer utestId;
    
    private Integer queId;
    
    private String answerOpt;
    
    private Integer isCorrect;


}

