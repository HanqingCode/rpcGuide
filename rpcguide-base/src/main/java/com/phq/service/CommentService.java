package com.phq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.phq.domain.ResponseResult;
import com.phq.domain.entity.Comment;

/**
 * (Comment)表服务接口
 *
 * @author makejava
 * @since 2023-08-24 18:39:44
 */
public interface CommentService extends IService<Comment> {

    ResponseResult commentList(String id);
}

