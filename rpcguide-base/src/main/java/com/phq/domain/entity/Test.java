package com.phq.domain.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (Test)表实体类
 *
 * @author makejava
 * @since 2023-08-28 23:10:40
 */
@Data
@TableName("test")
public class Test {
    
    private Integer testId;
    
    private Integer chId;
    
    private Integer numOfQue;
    
    private Date createdAt;
    
    private Integer isDeleted;


}

