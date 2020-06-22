package com.fly;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Configuration
@ComponentScan
@MapperScan(basePackages = "com.fly.mapper")
public class AppConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws IOException {
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        factoryBean.setConfigLocation(new ClassPathResource("sqlMapConfig.xml"));
        factoryBean.setMapperLocations(resourcePatternResolver.getResources("classpath*:com/fly/mapper/*Mapper.xml"));

        return factoryBean;
    }


    public DataSource dataSource(){
        Properties prop = new Properties();
        InputStream in = AppConfig.class.getClassLoader().getResourceAsStream("jdbc.properties");
        DataSource dataSource = null;
        try {
            prop.load(in);
            dataSource = DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
