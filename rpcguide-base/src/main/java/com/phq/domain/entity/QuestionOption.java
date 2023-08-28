package com.phq.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (QuestionOption)表实体类
 *
 * @author makejava
 * @since 2023-08-28 23:20:26
 */
@Data
@TableName("question_option")
public class QuestionOption {
    
    private Integer optId;
    
    private Integer queId;
    
    private String content;


}

