package com.springioc.learning.config;

import com.springioc.learning.beans.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author tangjianghua
 * date 2020/5/9
 * time 10:40
 */
@Configuration
public class BeanConfig {

   /* @Bean
    @Scope("singleton")
    public TestBean testBean(){
        return new TestBean();
    }*/
}
