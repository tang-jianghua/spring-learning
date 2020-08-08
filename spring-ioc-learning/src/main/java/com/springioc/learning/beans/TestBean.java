package com.springioc.learning.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author tangjianghua
 * date 2020/5/8
 * time 9:55
 */
//@Component
public class TestBean {
    Test2 test2;

    public Test2 getTest2() {
        return test2;
    }

    public void setTest2(Test2 test2) {
        this.test2 = test2;
    }

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void hello(){
        System.out.println("hello world");
    }
}
