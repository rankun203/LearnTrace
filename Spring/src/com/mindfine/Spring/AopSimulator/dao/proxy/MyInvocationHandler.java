package com.mindfine.Spring.AopSimulator.dao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import static java.lang.System.currentTimeMillis;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-28
 * Time: 上午10:16
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;
    public MyInvocationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("Method Invoke start ……");

        long startt = System.currentTimeMillis();

        Object obj = method.invoke(target, args);

        System.out.println("Method Invoke spent " + (System.currentTimeMillis() - startt) + " ms.");

        return obj;
    }
}
