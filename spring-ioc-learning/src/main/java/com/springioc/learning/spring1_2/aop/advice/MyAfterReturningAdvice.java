package com.springioc.learning.spring1_2.aop.advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author tangjianghua
 * date 2020/5/12
 * time 17:12
 */
//@Component
public class MyAfterReturningAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("1.2afterReturning----"+method.getName()+"--------"+o);
    }
}
