package com.phq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.phq.domain.ResponseResult;
import com.phq.domain.entity.Chapter;

/**
 * (ChapterList)表服务接口
 *
 * @author makejava
 * @since 2023-08-07 22:14:03
 */
public interface ChapterService extends IService<Chapter> {

    ResponseResult chapterList();

    ResponseResult getChapterDetail(String id);

}

