package com.phq.domain.vo;

import com.phq.domain.entity.Question;
import lombok.Data;

import java.util.List;

/**
 * @author: phq
 * @date: 2023/8/28
 */

@Data
public class TestVo {

    private Integer testId;

    private Integer chId;

    private Integer numOfQue;

    //此测验test里的所有题目questions
    private List<QuestionVo> questionVoList;

}
