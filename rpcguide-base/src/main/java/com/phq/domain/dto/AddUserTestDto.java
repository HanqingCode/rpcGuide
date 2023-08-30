package com.phq.domain.dto;

import com.alibaba.fastjson.JSON;
import com.phq.domain.entity.UserQuestion;
import lombok.Data;

import java.util.List;

/**
 * @author: phq
 * @date: 2023/8/30
 */

@Data
public class AddUserTestDto {

    private Integer utestId;

    private Integer uId;

    private Integer testId;

    private List<UserQuestion> answer;

    private Integer score;


}
