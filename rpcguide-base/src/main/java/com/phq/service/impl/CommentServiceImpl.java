package com.phq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phq.dao.CommentDao;
import com.phq.domain.entity.Comment;
import com.phq.service.CommentService;
import org.springframework.stereotype.Service;

/**
 * (Comment)表服务实现类
 *
 * @author makejava
 * @since 2023-08-24 18:39:44
 */
@Service("commentService")
public class CommentServiceImpl extends ServiceImpl<CommentDao, Comment> implements CommentService {

}

