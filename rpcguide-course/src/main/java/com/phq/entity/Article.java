package com.phq.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * (Article)表实体类
 *
 * @author makejava
 * @since 2023-08-07 01:05:42
 */

@SuppressWarnings("serial")
@Data
public class Article {
    
    private Integer artId;
    
    private Integer chId;
    
    private String artName;
    
    private String artPath;


}

