package com.phq.rpcguide.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: phq
 * @date: 2023/8/3
 */
@Data
@TableName("user_progress")
public class UserProgress {

    private Integer uID;

    private Integer coID;

    private Integer progress;

    private Integer degree;

    private Integer avrScore;
}
