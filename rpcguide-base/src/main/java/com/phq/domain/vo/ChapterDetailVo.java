package com.phq.domain.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author: phq
 * @date: 2023/8/18
 */

@Data
public class ChapterDetailVo {
    private Integer chId;
    private String chTitle;
    private Date createdAt;

    private String artPath;
    private String vidPath;
    private List<String> rscPaths;

}
