package com.mindfine.Spring.simulation.spring;

import com.mindfine.Spring.simulation.DAO.UserDAO;
import com.mindfine.Spring.simulation.model.User;
import com.mindfine.Spring.simulation.service.UserService;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-24
 * Time: 上午11:21
 */
public class ClassPathXmlApplicationContextTest {
    @Test
    public void testConstructor() throws Exception {
        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext();

        UserDAO userDao = (UserDAO)factory.getBean("u");
        UserService userService = new UserService();
        userService.setDao(userDao);
        User user = new User();
        user.setId(1);
        user.setName("张三");
        userService.addUser(user);
    }
}
