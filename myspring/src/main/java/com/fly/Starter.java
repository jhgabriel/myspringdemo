package com.fly;


import com.fly.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class Starter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext();

        applicationContext.register(AppConfig.class);
        applicationContext.refresh();

        UserService service = applicationContext.getBean(UserService.class);

        service.print();


    }
}
