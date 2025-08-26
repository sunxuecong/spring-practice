package com.atguigu.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 获取bean (1.根据id获取；2.根据类型获取;3.根据类型和id获取)
        // 根据id获取
        User user = (User)context.getBean("user");
        System.out.println("根据id获取"+user);
        user.run();

        // 根据类型获取
        User user2 = context.getBean(User.class);
        System.out.println("根据类型获取"+user2);
        user2.run();

        // 根据类型和id获取
        User user3 = context.getBean("user",User.class);
        System.out.println("根据类型和id获取"+user3);
    }
}
