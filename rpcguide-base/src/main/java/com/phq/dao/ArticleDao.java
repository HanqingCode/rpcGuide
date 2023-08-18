package com.phq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.domain.entity.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Article)表数据库访问层
 *
 * @author makejava
 * @since 2023-08-17 19:36:53
 */
@Mapper
public interface ArticleDao extends BaseMapper<Article> {

}

