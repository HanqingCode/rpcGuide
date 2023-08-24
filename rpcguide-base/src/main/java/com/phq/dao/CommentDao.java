package com.phq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.domain.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Comment)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-24 18:39:44
 */
@Mapper
public interface CommentDao extends BaseMapper<Comment> {

}

