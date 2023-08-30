package com.phq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.domain.entity.UserProgress;
import org.apache.ibatis.annotations.Mapper;

/**
 * (UserProgress)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-30 19:42:02
 */
@Mapper
public interface UserProgressDao extends BaseMapper<UserProgress> {

}

