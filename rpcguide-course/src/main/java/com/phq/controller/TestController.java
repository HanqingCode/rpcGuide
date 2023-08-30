package com.phq.controller;

import com.phq.domain.ResponseResult;
import com.phq.domain.dto.AddUserTestDto;
import com.phq.service.TestService;
import org.springframework.web.bind.annotation.*;

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


    /**
     * 添加测验记录addUserTestRecord - 添加章节测验记录，并返回成绩结果
     * add UserTest Record
     *{
     *     "uId": null,     //用户id
     *     "testId": 14,    //测验id
     *     "answer": [      //答案
     *         {
     *             "queId": 1,  //题目id
     *             "answerOpt": "3",  //答题内容
     *         }
     *     ]
     * }
     * @return 所有数据
     *
     * {
     *     "score": 2,      //分数
     *     "answer": [      //答案
     *         {
     *             "queId": 1,        //题目id
     *             "answerOpt": "3",  //答题内容
     *            "isCorrect": 0     //错误为0，正确为1
     *         }
     *     ]
     * }
     */
    @PostMapping
    public ResponseResult addUserTestRecord(@RequestBody AddUserTestDto addUserTestDto){
        return testService.addUserTestRecord(addUserTestDto);
    }






}
