package com.phq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phq.dao.CommentDao;
import com.phq.domain.ResponseResult;
import com.phq.domain.entity.Chapter;
import com.phq.domain.entity.Comment;
import com.phq.domain.vo.ChapterListVo;
import com.phq.domain.vo.CommentListVo;
import com.phq.service.CommentService;
import com.phq.utils.BeanCopyUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Comment)表服务实现类
 *
 * @author makejava
 * @since 2023-08-24 18:39:44
 */
@Service("commentService")
public class CommentServiceImpl extends ServiceImpl<CommentDao, Comment> implements CommentService {

    /**
     * 评论列表commentList - 查询此章节的所有评论
     * query all comments in this chapter
     *
     * @return 所有数据
     */
    @Override
    public ResponseResult commentList(String id) {
        //查询此章节的所有评论 封装成ResponseResult返回
        //根据此章节id查询评论
        LambdaQueryWrapper<Comment> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Comment::getChId, id);
        List<Comment> comments = list(queryWrapper);
        //把comments拷贝成commentListVo
        List<CommentListVo> commentsVo = BeanCopyUtils.copyBeanList(comments, CommentListVo.class);
        //封装成ResponseResult返回
        return ResponseResult.okResult(commentsVo);
    }
}

