package com.phq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.domain.entity.QuestionOption;
import org.apache.ibatis.annotations.Mapper;

/**
 * (QuestionOption)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-28 23:20:26
 */
@Mapper
public interface QuestionOptionDao extends BaseMapper<QuestionOption> {

}

