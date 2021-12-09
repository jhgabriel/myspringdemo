package com.fly.dao;

//@Repository
public class UserDaoImpl3 implements UserDao {

    public UserDaoImpl3() {
        System.out.println("this is UserDaoImpl3");
    }

    @Override
    public void print() {
        System.out.println("UserDaoImpl3 --- print");
    }
}
