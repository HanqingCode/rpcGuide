package com.phq.controller;




import com.phq.domain.entity.Chapter;
import com.phq.domain.ResponseResult;
import com.phq.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * (Chapter)表控制层
 *
 * @author makejava
 * @since 2023-08-07 22:14:01
 */
@RestController
@RequestMapping("/chapter")
public class ChapterController {
    /**
     * 服务对象
     */
    @Autowired
    private ChapterService chapterService;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @GetMapping("/test")
    public List<Chapter> test(){
        return chapterService.list();
    }

    @GetMapping("/list")
    public ResponseResult chapterList(){
        //查询所有章节 封装成ResponseResult返回
        ResponseResult result =  chapterService.chapterList();
        return result;
    }

}

