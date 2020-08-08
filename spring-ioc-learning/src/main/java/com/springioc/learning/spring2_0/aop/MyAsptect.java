package com.springioc.learning.spring2_0.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author tangjianghua
 * date 2020/5/12
 * time 17:12
 */
//@Aspect
//@Component
public class MyAsptect {

//    @Before(value = "com.springioc.learning.spring2_0.aop.SystemArchitecture.inServiceLayer()")
    public void before(JoinPoint joinPoint){
        System.out.println("2.0before-----参数:"+joinPoint.getArgs());
    }

//    @AfterReturning(value = "com.springioc.learning.spring2_0.aop.SystemArchitecture.inServiceLayer()",returning = "result")
    public void afterReturning(Object result){
        System.out.println("2.0afterReturning------------"+result);
    }
}
