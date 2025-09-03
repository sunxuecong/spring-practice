package com.atguigu.spring6.iocxml.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testjdbc {
@Test
    public  void  demo2 (){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource dataSource = context.getBean(DruidDataSource.class);

        System.out.println("dataSource的url为" + dataSource.getUrl());
    }
    @Test
    public  void  demo1 (){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:msql://localhost:3306/ssm?serverTimeZone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("atguigu");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    }
}
