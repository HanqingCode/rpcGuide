package com.phq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.phq.domain.ResponseResult;
import com.phq.domain.dto.AddUserTestDto;
import com.phq.domain.entity.Test;

/**
 * (Test)表服务接口
 *
 * @author makejava
 * @since 2023-08-28 23:10:41
 */
public interface TestService extends IService<Test> {

    ResponseResult testList(String id);

    ResponseResult addUserTestRecord(AddUserTestDto addUserTestDto);
}

