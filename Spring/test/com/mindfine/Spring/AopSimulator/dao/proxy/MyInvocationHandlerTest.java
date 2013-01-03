package com.mindfine.Spring.AopSimulator.dao.proxy;

import com.mindfine.Spring.AopSimulator.common.ClassPathXmlConfLoader;
import com.mindfine.Spring.AopSimulator.dao.IGroupDAO;
import com.mindfine.Spring.AopSimulator.dao.IUserDAO;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-28
 * Time: 上午10:22
 * ‘我们需要准备：
 * ’    1、被代理类
 * ‘    2、调用方法的控制类，由他来操作代理过程。在他调用对应的对象的对应方法的前后可以加我们自己的逻辑。
 * ’因为Handler里面聚合的对象是一个Object类型的，JDK的Proxy类就可以用Handler来产生可以代理任何对象的代理类。他的功能重心就放到了添加我们自己的逻辑上去了。
 * ‘需要用到Proxy类的newProxyInstance()方法来帮我们生成一个可以代理某个接口进行操作的代理类。当然我们需要给他传递他要代理的类的上下文，和接口。
 * ’    还有我们实现的他给的代理模版：myHandler。他会按照模版去调用myHandler的invoke()方法。
 * ’对于Handler的invoke()方法，Proxy.newProxyInstance()生成对应接口的代理方法的时候，会给我们的Handler传递：
 * ’    1、要调用的Method对象
 * ‘    2、真实的Proxy对象，这对象是JDK自动生成的真正的代理实例。
 * ’    3、一系列参数，调用Method的时候需要传递的参数，或许是空的。我们通过newProxyInstance()产生的代理对象来调用接口的方法，给他传什么参数，都会传到 args[] 中去。
 */
public class MyInvocationHandlerTest {
   @Test
    public void testMyHandler() throws Exception {
       ClassPathXmlConfLoader loader =  new ClassPathXmlConfLoader();
       IUserDAO userDAOImplTarget = (IUserDAO)loader.getBean("IUserDAO");
       IGroupDAO groupDAOImplTarget = (IGroupDAO) loader.getBean("IGroupDAO");

       //把要被代理的类交给我们自定义的InvocationHandler，Handler有调用被代理类的方法的功能
       InvocationHandler myHandler = new TimeSpentHandler(userDAOImplTarget);
       InvocationHandler groupHandler = new TimeSpentHandler(groupDAOImplTarget);

       IUserDAO proxy = (IUserDAO)Proxy.newProxyInstance(
               userDAOImplTarget.getClass().getClassLoader(),
               userDAOImplTarget.getClass().getInterfaces(),
               myHandler
       );
       IGroupDAO groupProxy = (IGroupDAO)Proxy.newProxyInstance(
               groupDAOImplTarget.getClass().getClassLoader(),
               groupDAOImplTarget.getClass().getInterfaces(),
               groupHandler
       );

       proxy.saveUser("笑一笑");
       groupProxy.delGroup(111);

   }
}
