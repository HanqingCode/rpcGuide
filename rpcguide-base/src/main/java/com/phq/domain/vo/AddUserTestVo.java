package com.phq.domain.vo;

import com.phq.domain.entity.UserQuestion;
import lombok.Data;

import java.util.List;

/**
 * @author: phq
 * @date: 2023/8/30
 */
@Data
public class AddUserTestVo {
    private List<UserQuestion> answer;

    private Integer score;

}
