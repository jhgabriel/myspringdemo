package com.fly.service;

import com.fly.dao.UserDao;
import com.fly.mapper.UserMapper;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl1 implements UserService,BeanNameAware {

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl1() {
        System.out.println("this is ServiceImpl1");
    }

    @Override
    public void print(){
        userDao.print();
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
}
