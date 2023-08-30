package com.phq.rpcguide.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.rpcguide.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: phq
 * @date: 2023/8/3
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
