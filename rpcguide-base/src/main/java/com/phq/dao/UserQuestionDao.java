package com.phq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.domain.entity.UserQuestion;
import org.apache.ibatis.annotations.Mapper;

/**
 * (UserQuestion)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-30 01:35:06
 */
@Mapper
public interface UserQuestionDao extends BaseMapper<UserQuestion> {

}

