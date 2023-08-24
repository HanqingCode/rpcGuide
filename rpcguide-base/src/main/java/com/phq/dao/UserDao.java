package com.phq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-19 13:15:49
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}

