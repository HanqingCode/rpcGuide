package com.phq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.domain.entity.Chapter;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Chapter)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-07 22:14:02
 */
@Mapper
public interface ChapterDao extends BaseMapper<Chapter> {

}

