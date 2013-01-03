package com.mindfine.spring.intercepter;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 13-1-2
 * Time: 上午11:35
 */
@Component("logIntercepter")
@Aspect
public class LogIntercepter {

    @Before("execution(public * com.mindfine.spring.service.StudentService.addStudent(com.mindfine.spring.model.Student))")
    public void logging(){
        System.out.println("日志来了~~~~~~~~~~");
    }

}
