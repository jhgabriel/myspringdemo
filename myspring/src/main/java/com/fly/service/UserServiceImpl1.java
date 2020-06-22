package com.fly.service;

import com.fly.dao.UserDao;
import com.fly.dao.UserDaoImpl1;
import com.fly.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl1 implements UserService {

//    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
//    public UserDaoImpl1 getUserDaoImpl1() {
////        return userDaoImpl1;
////    }
////
//    public void setUserDaoImpl1(UserDaoImpl1 userDaoImpl1) {
//        this.userDaoImpl1 = userDaoImpl1;
//    }

    public UserServiceImpl1() {
        System.out.println("this is ServiceImpl1");
    }

    @Override
    public void print(){
        userDao.print();
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }
}
