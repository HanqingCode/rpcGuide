package com.phq.domain.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author: phq
 * @date: 2023/8/28
 */

@Data
public class CommentListVo {
    private Integer cmmtId;

    private Integer chId;

    private Integer uId;

    private String content;

    private Integer parentCommt;

    private Date createdAt;


}
