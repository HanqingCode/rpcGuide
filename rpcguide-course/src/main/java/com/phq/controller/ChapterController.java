package com.phq.controller;




import com.phq.domain.entity.Chapter;
import com.phq.domain.ResponseResult;
import com.phq.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * (ChapterList)表控制层
 *
 * @author phq
 * @since 2023-08-07 22:14:01
 */
@RestController
@RequestMapping("/chapter")
public class ChapterController {
    /**
     * 服务对象 chapterService
     */
    @Autowired
    private ChapterService chapterService;

    /**
     * 查询所有数据 test
     *
     * @return 所有数据
     */
    @GetMapping("/test")
    public List<Chapter> test(){
        return chapterService.list();
    }


    /**
     * 查询所有章节 query all chapters
     *
     * @return 所有数据
     */
    @GetMapping("/list")
    public ResponseResult chapterList(){
        //查询所有章节 封装成ResponseResult返回
        ResponseResult result =  chapterService.chapterList();
        return result;
    }

    /**
     * 查询某个章节的详细内容，包括章节的文章、视频、资源
     * query chapter's detail
     *
     * @return 所有数据
     */
    @GetMapping("/{id}")
    public ResponseResult getChapterDetail(@PathVariable("id") String id){
        return chapterService.getChapterDetail(id);

    }

}

