package com.phq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phq.dao.QuestionDao;
import com.phq.domain.entity.Question;
import com.phq.service.QuestionService;
import org.springframework.stereotype.Service;

/**
 * (Question)表服务实现类
 *
 * @author makejava
 * @since 2023-08-24 18:52:36
 */
@Service("questionService")
public class QuestionServiceImpl extends ServiceImpl<QuestionDao, Question> implements QuestionService {

}

