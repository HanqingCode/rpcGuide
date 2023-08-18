package com.phq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.domain.entity.Video;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Video)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-18 19:58:05
 */
@Mapper
public interface VideoDao extends BaseMapper<Video> {

}

