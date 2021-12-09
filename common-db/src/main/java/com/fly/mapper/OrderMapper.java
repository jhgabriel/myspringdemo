package com.fly.mapper;


import com.fly.pojo.User;

import java.util.List;
import java.util.Map;

//@Repository
public interface OrderMapper {
    int insertUser(Map map);
    int updateUser(Map map);
    List<User> selectUser();
}
