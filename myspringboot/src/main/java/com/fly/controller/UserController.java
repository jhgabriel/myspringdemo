package com.fly.controller;


import com.fly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public String queryUserById(@PathVariable("id")Long id, HttpServletRequest request){
        HttpSession session = request.getSession();
        if(session!=null){
            System.out.println(session.getAttribute("user"));
        }
//        int i=1/0;
        String str = this.userService.findUserById(id).toString();
        session.setAttribute("user",str);
        return str==null?null:str;
    }
}
