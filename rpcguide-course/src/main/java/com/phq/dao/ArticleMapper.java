package com.phq.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.phq.domain.entity.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: phq
 * @date: 2023/8/7
 */

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}
