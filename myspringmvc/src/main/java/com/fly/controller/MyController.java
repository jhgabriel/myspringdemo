package com.fly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MyController {


    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello springboot";
    }

    @RequestMapping("/upload")
    public void upload(@RequestPart("zilu") MultipartFile multipartFile){
        System.out.println("this is multipartFile");

    }
}
