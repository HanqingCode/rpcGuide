package com.phq.domain.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (Comment)表实体类
 *
 * @author makejava
 * @since 2023-08-24 18:39:44
 */
@Data
@TableName("comment")
public class Comment {
    
    private Integer cmmtId;
    
    private Integer chId;
    
    private Integer uId;
    
    private String content;
    
    private Integer parentCommt;
    
    private Date createdAt;
    
    private Integer isDeleted;


}

