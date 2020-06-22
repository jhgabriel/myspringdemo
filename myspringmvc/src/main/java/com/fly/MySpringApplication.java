package com.fly;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class MySpringApplication {
    public static void run() throws LifecycleException {
        AnnotationConfigWebApplicationContext context
                = new AnnotationConfigWebApplicationContext();

        context.register(AppConfig.class);
        context.refresh();

        File base = new File(System.getProperty("java.io.tmpdir"));


        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9080);

        Context rootCtx = tomcat.addContext("/",base.getAbsolutePath());

        DispatcherServlet servlet = new DispatcherServlet(context);

        Tomcat.addServlet(rootCtx,"luban",servlet).setLoadOnStartup(1);

        rootCtx.addServletMapping("/","luban");
        tomcat.start();
        tomcat.getServer().await();


    }

}
