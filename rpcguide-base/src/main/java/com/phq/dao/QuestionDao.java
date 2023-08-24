package com.phq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.domain.entity.Question;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Question)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-24 18:52:35
 */
@Mapper
public interface QuestionDao extends BaseMapper<Question> {

}

