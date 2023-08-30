package com.phq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.domain.entity.UserProfile;
import org.apache.ibatis.annotations.Mapper;

/**
 * (UserProfile)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-30 19:40:22
 */
@Mapper
public interface UserProfileDao extends BaseMapper<UserProfile> {

}

