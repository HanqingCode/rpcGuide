package com.phq.controller;

/**
 * @author: phq
 * @date: 2023/8/30
 */

import com.phq.domain.ResponseResult;
import com.phq.domain.dto.AddUserTestDto;
import com.phq.domain.vo.UserProfileVo;
import com.phq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户登陆控制层
 * login
 *
 * @author: phq
 * @date: 2023/8/19
 */

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户信息查询userProfile - 查询用户信息 （带token）
     * query user profile
     *
     * @return 所有数据
     */
    @GetMapping("/profile")
    public ResponseResult userProfile(){
        return userService.userProfile();
    }


    /**
     * 用户进度查询userProgress - 查询用户课程进度 （带token）
     * query user progress
     *
     * @return 所有数据
     */
    @GetMapping("/progress")
    public ResponseResult userProgress(){
        return userService.userProgress();
    }






    /**
     * 用户信息查询userProfile - 查询用户信息 （不带token）
     * query user profile
     *
     * @return 所有数据
     */
    @GetMapping("/profile/{id}")
    public ResponseResult userProfile(@PathVariable("id") String id){
        return userService.userProfile(id);
    }


    /**
     * 用户进度查询userProgress - 查询用户课程进度 （不带token）
     * query user progress
     *
     * @return 所有数据
     */
    @GetMapping("/progress/{id}")
    public ResponseResult userProgress(@PathVariable("id") String id){
        return userService.userProgress(id);
    }



    /**
     * 用户信息修改updateUserProfile - 修改用户信息 （不带token）
     * update UserProfile
     *
     * @return 所有数据
     */
    @PutMapping("/profile")
    public ResponseResult updateUserProfile(@RequestBody UserProfileVo userProfileVo){
        return userService.updateUserProfile(userProfileVo);
    }




    /**
     * 查询用户所有测验记录 UserTestRecordList
     * query UserTest Records
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
    @GetMapping("/test/{id}")
    public ResponseResult UserTestRecordList(@PathVariable("id") String id){
        return ResponseResult.okResult(200,"测试接口");
    }





}
