package com.phq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.domain.entity.Test;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Test)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-28 23:10:40
 */
@Mapper
public interface TestDao extends BaseMapper<Test> {

}

