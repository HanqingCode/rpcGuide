package com.phq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phq.dao.ArticleMapper;
import com.phq.domain.entity.Article;
import com.phq.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * @author: phq
 * @date: 2023/8/7
 */

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
}
