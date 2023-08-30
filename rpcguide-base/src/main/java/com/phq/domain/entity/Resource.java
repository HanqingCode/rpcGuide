package com.phq.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (Resource)表实体类
 *
 * @author makejava
 * @since 2023-08-18 19:59:21
 */
@Data
@TableName("resource")
public class Resource {
    @TableId
    private Integer rscId;
    
    private Integer chId;
    
    private String rscName;
    
    private String rscPath;


}

