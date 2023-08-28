package com.phq.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.phq.domain.ResponseResult;
import com.phq.domain.entity.Comment;
import com.phq.service.CommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Comment)表控制层
 *
 * @author makejava
 * @since 2023-08-24 18:39:42
 */
@RestController
@RequestMapping("comment")
public class CommentController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private CommentService commentService;


    /**
     * 评论列表commentList - 查询此章节的所有评论
     * query all comments in this chapter
     *
     * @return 所有数据
     */
    @GetMapping("/{id}")
    public ResponseResult commentList(@PathVariable("id") String id){
        return commentService.commentList(id);
    }



//
//    /**
//     * 新增数据
//     *
//     * @param comment 实体对象
//     * @return 新增结果
//     */
//    @PostMapping
//    public R insert(@RequestBody Comment comment) {
//        return success(this.commentService.save(comment));
//    }
//
//
//    /**
//     * 删除数据
//     *
//     * @param idList 主键结合
//     * @return 删除结果
//     */
//    @DeleteMapping
//    public R delete(@RequestParam("idList") List<Long> idList) {
//        return success(this.commentService.removeByIds(idList));
//    }


}

