package com.springioc.learning.service.impl;

import com.springioc.learning.service.TestService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author tangjianghua
 * date 2020/5/12
 * time 17:11
 */
//@Service
public class TestServiceImpl implements TestService {

    @Override
    public String test(String... args) {
        System.out.println("--------test----"+ Arrays.toString(args));
        return Arrays.toString(args);
    }
}
