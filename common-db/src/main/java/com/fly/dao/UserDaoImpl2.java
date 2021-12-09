package com.fly.dao;

//@Repository
public class UserDaoImpl2 implements UserDao {
    private String string;

    public UserDaoImpl2(String string) {
        this.string = string;
    }


    public UserDaoImpl2() {
        System.out.println("this is UserDaoImpl2");
    }


    public void print() {
        System.out.println("UserDaoImpl2 -- print");
    }


}
