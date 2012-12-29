package com.mindfine.Spring.AopSimulator.dao.proxy;

import com.mindfine.Spring.AopSimulator.common.ClassPathXmlConfLoader;
import com.mindfine.Spring.AopSimulator.dao.IUserDAO;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-28
 * Time: 上午10:22
 */
public class MyInvocationHandlerTest {
   @Test
    public void testMyHandler() throws Exception {
       IUserDAO target = (IUserDAO) new ClassPathXmlConfLoader().getBean("IUserDAO");
       InvocationHandler myHandler = new MyInvocationHandler(target);

       IUserDAO proxy = (IUserDAO)Proxy.newProxyInstance(
               target.getClass().getClassLoader(),
               target.getClass().getInterfaces(),
               myHandler
       );

       proxy.saveUser("笑一笑");

   }
}
