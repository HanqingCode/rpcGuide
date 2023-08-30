package com.phq.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (Article)表实体类
 *
 * @author makejava
 * @since 2023-08-17 19:36:59
 */
@Data
@TableName("article")
public class Article {
    @TableId
    private Integer artId;
    
    private Integer chId;
    
    private String artName;
    
    private String artPath;


}

