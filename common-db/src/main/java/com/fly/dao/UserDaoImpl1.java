package com.fly.dao;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

//@Scope("prototype")
@Repository
public class UserDaoImpl1 implements UserDao {
    private String string;

    public UserDaoImpl1(String string) {
        this.string = string;
    }


    public UserDaoImpl1() {
        System.out.println("this is UserDaoImpl1");
    }


    public void print() {
        System.out.println("UserDaoImpl1 -- print");
    }

}
