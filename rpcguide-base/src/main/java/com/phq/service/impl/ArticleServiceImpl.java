package com.phq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phq.dao.ArticleDao;
import com.phq.domain.entity.Article;
import com.phq.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * (Article)表服务实现类
 *
 * @author makejava
 * @since 2023-08-17 19:37:01
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements ArticleService {

}

