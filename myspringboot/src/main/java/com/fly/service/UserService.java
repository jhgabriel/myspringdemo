package com.fly.service;


import com.fly.mapper.UserMapper;
import com.fly.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(Long id){
        User user = new User();
        user.setId(id);
        user = this.userMapper.selectUser(user);
        return user;
    }
}
