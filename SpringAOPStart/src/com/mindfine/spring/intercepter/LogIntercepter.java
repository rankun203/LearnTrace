package com.mindfine.spring.intercepter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 13-1-2
 * Time: 上午11:35
 */
@Component("logIntercepter")
//@Aspect
public class LogIntercepter {

//    @Pointcut("execution(public * com.mindfine.spring.dao..*.*(..))")
    public void pointCut(){}

//    @Before("pointCut()")
//    @Before("execution(public * com.mindfine.spring.service.StudentService.addStudent(com.mindfine.spring.model.Student))")
    public void logging() {
        System.out.println("日志来了~~~~~~~~~~");
    }

//    @AfterReturning("pointCut()")
    public void afterReturing() {
        System.out.println("Method returned.");
    }

//    @Around("pointCut()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around before.");
        Object a = pjp.proceed();
        System.out.println("Class: " + pjp.getTarget().getClass().getName());
        System.out.println("Around after.");
    }
}
