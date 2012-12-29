package com.mindfine.Spring.FirstSpring.service;

import com.mindfine.Spring.FirstSpring.DB.DB;
import com.mindfine.Spring.FirstSpring.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-25
 * Time: 上午12:00
 */
public class UserServiceTest {
    @Test
    public void testUserService() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-conf.xml");
        UserService userService = (UserService)context.getBean("userService");
        UserService userService1 = (UserService) context.getBean("userService");
        System.out.println("userService == userService1: " + (userService == userService1));
        User u = new User();
        u.setId(2);
        u.setName("张三丰");
        userService.addUser(u);
    }

    @Test
    public void testInjectValueToProperty(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-conf.xml");
        DB db = (DB)context.getBean("db");
        db.getConnection();
    }
}
