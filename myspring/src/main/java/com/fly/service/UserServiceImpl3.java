package com.fly.service;

import com.fly.dao.UserDao;

//@Service
public class UserServiceImpl3 implements UserService {

//    @Autowired
    private UserDao userDao;

    public UserServiceImpl3() {
        System.out.println("this is serviceImpl3");

    }

    public void print(){
        userDao.print();
    }
}
