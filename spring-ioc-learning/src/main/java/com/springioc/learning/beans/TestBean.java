package com.springioc.learning.beans;

/**
 * @author tangjianghua
 * date 2020/5/8
 * time 9:55
 */
public class TestBean {

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
