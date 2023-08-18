package com.phq.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * (ChapterList)表实体类
 *
 * @author makejava
 * @since 2023-08-07 22:14:02
 */
@Data
@TableName("chapter")
public class Chapter {

    @TableId
    private Integer chId;
    
    private Integer coId;
    
    private String chTitle;
    
    private Date createdAt;
    
    private Integer isDeleted;

    @TableField(exist = false)
    private String artPath;
    @TableField(exist = false)
    private String vidPath;
    @TableField(exist = false)
    private List<String> rscPaths;


}

