package com.phq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phq.dao.ChapterDao;
import com.phq.domain.ResponseResult;
import com.phq.domain.entity.Chapter;
import com.phq.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Chapter)表服务实现类
 *
 * @author makejava
 * @since 2023-08-07 22:14:04
 */
@Service
public class ChapterServiceImpl extends ServiceImpl<ChapterDao, Chapter> implements ChapterService {

    @Autowired
    private ChapterService chapterService;


    @Override
    public ResponseResult chapterList() {
        //查询所有章节 封装成ResponseResult返回
        LambdaQueryWrapper<Chapter> queryWrapper = new LambdaQueryWrapper<>();
        // 按照序号进行排序
        queryWrapper.orderByAsc(Chapter::getChId);
        //查询所有章节
        Page<Chapter> page = new Page<>(1,20);
        page(page,queryWrapper);
        List<Chapter> chapters = page.getRecords();
        //List<Chapter> chapters = baseMapper.selectList(queryWrapper);
        //封装成ResponseResult返回
        return ResponseResult.okResult(chapters);
    }




}

