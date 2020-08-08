package com.springioc.learning.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * @author tangjianghua
 * date 2020/5/13
 * time 9:17
 */
//@Component
public class DebugInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("before invocation--------");
        Object proceed = methodInvocation.proceed();
        System.out.println("after invocation-----"+proceed);
        return proceed;
    }
}
