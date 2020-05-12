package com.springioc.learning.spring1_2.aop.advice;


import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author tangjianghua
 * date 2020/5/12
 * time 17:16
 */
@Component
public class MyBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("1.2before----"+method.getName()+"----"+objects.toString());
    }
}
