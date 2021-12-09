package com.fly;

import com.fly.dao.UserDaoImpl1;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
//@Import(UserDaoImpl1.class)
public class AppConfig {

}
