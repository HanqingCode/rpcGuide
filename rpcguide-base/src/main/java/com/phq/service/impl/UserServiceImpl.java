package com.phq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phq.dao.UserDao;
import com.phq.domain.entity.User;
import com.phq.service.UserService;
import org.springframework.stereotype.Service;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2023-08-24 19:30:02
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}

