package com.phq.domain.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (Article)表实体类
 *
 * @author makejava
 * @since 2023-08-07 01:05:42
 */

@Data
@TableName("article")
public class Article {
    
    private Integer artId;
    
    private Integer chId;
    
    private String artName;
    
    private String artPath;


}

