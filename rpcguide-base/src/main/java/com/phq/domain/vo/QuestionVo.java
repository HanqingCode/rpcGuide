package com.phq.domain.vo;

import com.phq.domain.entity.QuestionOption;
import lombok.Data;

import java.util.List;

/**
 * @author: phq
 * @date: 2023/8/28
 */

@Data
public class QuestionVo {

    private Integer queId;

    private Integer testId;

    private Integer type;

    private String question;

    private Integer numOfOpt;

    private String correctOpt;

    private String explanation;

    //此题目的所有选项
    private List<QuestionOption> questionOptionList;
}
