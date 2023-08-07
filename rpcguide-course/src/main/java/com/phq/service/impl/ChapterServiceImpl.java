package com.phq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phq.dao.ChapterDao;
import com.phq.domain.entity.Chapter;
import com.phq.service.ChapterService;
import org.springframework.stereotype.Service;

/**
 * (Chapter)表服务实现类
 *
 * @author makejava
 * @since 2023-08-07 22:14:04
 */
@Service("chapterService")
public class ChapterServiceImpl extends ServiceImpl<ChapterDao, Chapter> implements ChapterService {

}

