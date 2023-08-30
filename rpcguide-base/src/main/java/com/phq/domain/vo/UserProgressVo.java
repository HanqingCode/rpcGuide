package com.phq.domain.vo;

import lombok.Data;

/**
 * @author: phq
 * @date: 2023/8/30
 */

@Data
public class UserProgressVo {
    private Integer uId;

    private Integer coId;

    private Integer progress;

    private Integer degree;

    private Float avrScore;
}
