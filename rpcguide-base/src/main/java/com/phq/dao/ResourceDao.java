package com.phq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.domain.entity.Resource;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Resource)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-18 19:59:21
 */
@Mapper
public interface ResourceDao extends BaseMapper<Resource> {

}

