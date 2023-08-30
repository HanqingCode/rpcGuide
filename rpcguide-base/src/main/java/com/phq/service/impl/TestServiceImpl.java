package com.phq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phq.dao.QuestionDao;
import com.phq.dao.QuestionOptionDao;
import com.phq.dao.TestDao;
import com.phq.domain.ResponseResult;
import com.phq.domain.dto.AddUserTestDto;
import com.phq.domain.entity.Question;
import com.phq.domain.entity.QuestionOption;
import com.phq.domain.entity.Test;
import com.phq.domain.vo.QuestionVo;
import com.phq.domain.vo.TestVo;
import com.phq.service.TestService;
import com.phq.utils.BeanCopyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * (Test)表服务实现类
 *
 * @author makejava
 * @since 2023-08-28 23:10:41
 */
@Service("testService")
public class TestServiceImpl extends ServiceImpl<TestDao, Test> implements TestService {

    @Autowired
    private QuestionDao questionDao;
    @Autowired
    private QuestionOptionDao questionOptionDao;


    /**
     * 章节测验列表testList - 查询此章节测验的所有题目
     * query all questions in this chapter test
     *
     * @return 所有数据
     */
    @Override
    public ResponseResult testList(String id) {
        //查询此章节测验的题目 封装成ResponseResult返回
        //根据此章节id查询对应的章节测验
        LambdaQueryWrapper<Test> testWrapper = new LambdaQueryWrapper<>();
        testWrapper.eq(Test::getChId, id);
        Test test = getOne(testWrapper);

        //根据章节测验id查询题目
        LambdaQueryWrapper<Question> questionWrapper = new LambdaQueryWrapper<>();
        questionWrapper.eq(Question::getTestId, test.getTestId());
        List<Question> questionList = questionDao.selectList(questionWrapper);

        //把questionList拷贝成questionVoList
        List<QuestionVo> questionVoList = BeanCopyUtils.copyBeanList(questionList, QuestionVo.class);

        for (int i = 0; i < questionVoList.size(); i++) {
            //根据题目id查询选项
            QuestionVo qVo = questionVoList.get(i);
            LambdaQueryWrapper<QuestionOption> questionOptionWrapper = new LambdaQueryWrapper<>();
            questionOptionWrapper.eq(QuestionOption::getQueId, qVo.getQueId());
            List<QuestionOption> questionOptionList = questionOptionDao.selectList(questionOptionWrapper);
            //把选项封装进questionVoList的每个questionVo里
            qVo.setQuestionOptionList(new ArrayList<QuestionOption>());
            for (QuestionOption qO : questionOptionList) {
                qVo.getQuestionOptionList().add(qO);
            }
        }

        //把test封装成testVo
        TestVo testVo = BeanCopyUtils.copyBean(test, TestVo.class);
        //把questionVoList放进testVo
        testVo.setQuestionVoList(questionVoList);

        //封装成ResponseResult返回
        return ResponseResult.okResult(testVo);
    }



     /**
     * 添加测验记录addUserTestRecord - 添加章节测验记录，并返回成绩结果
     * add UserTest Record
     *{
     *     "uId": 1,     //用户id
     *     "testId": 1,    //测验id
     *     "answer": [      //答案
     *         {
     *             "queId": 1,  //题目id
     *             "answerOpt": "3"  //答题内容
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
    @Override
    public ResponseResult addUserTestRecord(AddUserTestDto addUserTestDto) {
        //TODO
        return null;
    }
}

