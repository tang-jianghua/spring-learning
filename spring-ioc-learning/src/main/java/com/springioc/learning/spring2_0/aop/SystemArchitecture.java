package com.springioc.learning.spring2_0.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author tangjianghua
 * date 2020/5/13
 * time 9:26
 */
//@Aspect
//@Component
public class SystemArchitecture {

    // service 层
//    @Pointcut("within(com.springioc.learning.service..*)")
    public void inServiceLayer() {
        System.out.println("pointcut--inServiceLayer----");
    }

//    @Pointcut("execution(* com.springioc.learning.service.*.*(..))")
    public void inServiceLayer2() {}
}
