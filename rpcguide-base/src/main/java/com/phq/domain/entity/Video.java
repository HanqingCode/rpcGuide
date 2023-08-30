package com.phq.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (Video)表实体类
 *
 * @author makejava
 * @since 2023-08-18 19:58:05
 */
@Data
@TableName("video")
public class Video {
    @TableId
    private Integer vidId;
    
    private Integer chId;
    
    private String vidName;
    
    private String vidPath;


}

