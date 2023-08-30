package com.phq.rpcguide.user.service;
import com.phq.rpcguide.user.dao.UserDao;
import com.phq.rpcguide.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: phq
 * @date: 2023/8/3
 */


import java.util.List;

@Service
public class UserServiceImpl {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUserById(Integer uID) {
        return userDao.selectById(uID);
    }

    public List<User> getAllUsers() {
        return userDao.selectList(null);
    }

    public void saveUser(User user) {
        userDao.insert(user);
    }

    public void updateUser(User user) {
        userDao.updateById(user);
    }

    public void deleteUser(Integer uID) {
        userDao.deleteById(uID);
    }
}

