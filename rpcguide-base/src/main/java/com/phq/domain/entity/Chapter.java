package com.phq.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * (ChapterList)表实体类
 *
 * @author makejava
 * @since 2023-08-07 22:14:02
 */
@Data
@TableName("chapter")
public class Chapter {
    
    private Integer chId;
    
    private Integer coId;
    
    private String chTitle;
    
    private Date createdAt;
    
    private Integer isDeleted;


}

