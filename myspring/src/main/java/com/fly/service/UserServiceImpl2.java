package com.fly.service;

import com.fly.dao.UserDao;

//@Service
public class UserServiceImpl2 implements UserService {

//    @Autowired
    private UserDao userDao;

    public UserServiceImpl2() {
        System.out.println("this is serviceImpl2");

    }

    public void print(){
        userDao.print();
    }
}
