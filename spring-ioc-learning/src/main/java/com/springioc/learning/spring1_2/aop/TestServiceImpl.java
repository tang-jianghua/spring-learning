package com.springioc.learning.spring1_2.aop;

import org.springframework.stereotype.Service;

/**
 * @author tangjianghua
 * date 2020/5/12
 * time 17:11
 */
@Service
public class TestServiceImpl implements TestService{

    @Override
    public void test() {
        System.out.println("--------test");
    }
}
