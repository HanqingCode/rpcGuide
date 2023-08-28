package com.phq.controller;

import com.phq.domain.ResponseResult;
import com.phq.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Test 表控制层
 *
 * @author: phq
 * @date: 2023/8/28
 */

@RestController
@RequestMapping("test")
public class TestController {

    /**
     * 服务对象
     */
    @Resource
    private TestService testService;


    /**
     * 章节测验列表testList - 查询此章节测验的所有题目
     * query all questions in this chapter test
     *
     * @return 所有数据
     */
    @GetMapping("/{id}")
    public ResponseResult testList(@PathVariable("id") String id){
        return testService.testList(id);
    }
}
