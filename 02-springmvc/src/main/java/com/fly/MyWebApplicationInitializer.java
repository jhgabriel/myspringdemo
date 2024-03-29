package com.fly;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //System.out.println("this is MyWebApplicationInitializer");

        AnnotationConfigWebApplicationContext context
                = new AnnotationConfigWebApplicationContext();

        context.register(AppConfig.class);
        context.refresh();

        DispatcherServlet servlet = new DispatcherServlet(context);
        ServletRegistration.Dynamic registration = servletContext.addServlet("app",servlet);

        registration.setLoadOnStartup(1);
        registration.addMapping("*.*");

    }
}
