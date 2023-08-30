package com.phq.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (UserProgress)表实体类
 *
 * @author makejava
 * @since 2023-08-30 19:42:02
 */
@Data
@TableName("user_progress")
public class UserProgress {
    @TableId
    private Integer uId;
    
    private Integer coId;
    
    private Integer progress;
    
    private Integer degree;
    
    private Float avrScore;


}

