package com.phq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.domain.entity.UserTest;
import org.apache.ibatis.annotations.Mapper;

/**
 * (UserTest)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-30 01:33:06
 */
@Mapper
public interface UserTestDao extends BaseMapper<UserTest> {

}

