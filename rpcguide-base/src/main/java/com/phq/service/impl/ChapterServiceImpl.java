package com.phq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phq.dao.ChapterDao;
import com.phq.domain.ResponseResult;
import com.phq.domain.entity.Article;
import com.phq.domain.entity.Chapter;
import com.phq.domain.entity.Resource;
import com.phq.domain.entity.Video;
import com.phq.domain.vo.ChapterDetailVo;
import com.phq.domain.vo.ChapterListVo;
import com.phq.service.ArticleService;
import com.phq.service.ChapterService;
import com.phq.service.ResourceService;
import com.phq.service.VideoService;
import com.phq.utils.BeanCopyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    @Autowired
    private ArticleService articleService;
    @Autowired
    private VideoService videoService;
    @Autowired
    private ResourceService resourceService;



    /**
     * 查询所有章节 query all chapters
     *
     * @return 所有数据
     */
    @Override
    public ResponseResult chapterList() {
        //查询所有章节 封装成ResponseResult返回
        LambdaQueryWrapper<Chapter> queryWrapper = new LambdaQueryWrapper<>();
        //按照序号进行排序
        queryWrapper.orderByAsc(Chapter::getChId);
        //查询所有章节
        List<Chapter> chapters = list(queryWrapper);
        //把chapter类拷贝成chapterListVo类
        List<ChapterListVo> chaptersVo = BeanCopyUtils.copyBeanList(chapters, ChapterListVo.class);
        //封装成ResponseResult返回
        return ResponseResult.okResult(chaptersVo);
    }


    /**
     * 查询某个章节的详细内容，包括章节的文章、视频、资源
     * query chapter's detail
     *
     * @return 所有数据
     */
    @Override
    public ResponseResult getChapterDetail(String id) {
        //查询chapter
        Chapter chapter = getById(id);
        System.out.println(chapter.toString());

        //根据chid查询对应的文章article
        LambdaQueryWrapper<Article> articleWrapper = new LambdaQueryWrapper<>();
        articleWrapper.eq(Article::getChId, id);
        Article article = articleService.getOne(articleWrapper);
        //根据chid查询对应的视频video
        LambdaQueryWrapper<Video> videoWrapper = new LambdaQueryWrapper<>();
        videoWrapper.eq(Video::getChId, id);
        Video video = videoService.getOne(videoWrapper);
        //根据chid查询对应的资源resources
        LambdaQueryWrapper<Resource> resourceWrapper = new LambdaQueryWrapper<>();
        resourceWrapper.eq(Resource::getChId, id);
        Resource resource = resourceService.getOne(resourceWrapper);

        //转换成vo
        ChapterDetailVo chapterDetailVo = BeanCopyUtils.copyBean(chapter, ChapterDetailVo.class);
        chapterDetailVo.setArtPath(article.getArtPath());
        chapterDetailVo.setVidPath(video.getVidPath());
        chapterDetailVo.setRscPaths(new ArrayList<>());
        chapterDetailVo.getRscPaths().add(resource.getRscPath());

        //封装成响应返回
        return ResponseResult.okResult(chapterDetailVo);
    }


}

