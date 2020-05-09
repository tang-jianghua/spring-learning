package com.springmvc.learning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangjianghua
 * date 2020/4/30
 * time 11:46
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    public void test(){

    }
}
