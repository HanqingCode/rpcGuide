package com.phq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phq.dao.ChapterDao;
import com.phq.domain.ResponseResult;
import com.phq.domain.entity.Chapter;
import com.phq.domain.vo.ChapterListVo;
import com.phq.service.ChapterService;
import com.phq.utils.BeanCopyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (ChapterList)表服务实现类
 *
 * @author phq
 * @since 2023-08-07 22:14:04
 */
@Service
public class ChapterServiceImpl extends ServiceImpl<ChapterDao, Chapter> implements ChapterService {

    @Autowired
    private ChapterService chapterService;


    /**
     * 查询所有数据 query all chapters
     *
     * @return 所有数据
     */
    @Override
    public ResponseResult chapterList() {
        //查询所有章节 封装成ResponseResult返回
        LambdaQueryWrapper<Chapter> queryWrapper = new LambdaQueryWrapper<>();
        // 按照序号进行排序
        queryWrapper.orderByAsc(Chapter::getChId);
        //查询所有章节
        Page<Chapter> page = new Page<>(1,50);
        page(page,queryWrapper);
        List<Chapter> chapters = page.getRecords();
        //List<ChapterList> chapters = baseMapper.selectList(queryWrapper);
        //把chapter类拷贝成chapterListVo类
        List<ChapterListVo> chaptersVo = BeanCopyUtils.copyBeanList(chapters, ChapterListVo.class);
        //封装成ResponseResult返回
        return ResponseResult.okResult(chaptersVo);
    }




}

