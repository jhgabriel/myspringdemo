package com.fly.mapper;


import com.fly.pojo.User;

import java.util.List;
import java.util.Map;

//@Repository
public interface UserMapper {
    int insertUser(User user);
    int updateUser(User user);
    List<User> selectUser();
    User selectUser(User user);
}
