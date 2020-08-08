package com.springioc.learning;

import com.springioc.learning.beans.Test2;
import com.springioc.learning.config.BeanConfig;
import com.springioc.learning.service.TestService;
import com.springioc.learning.service.impl.TestServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tangjianghua
 * date 2020/5/8
 * time 9:56
 */

public class SpringIocMain {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
//        ClassPathXmlApplicationContext
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application1.2.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application2.0.xml");

//        FileSystemXmlApplicationContext
//        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:D:\\software\\spring-learning\\spring-ioc-learning/src/main/resources/application.xml");

//       注解模式
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//        TestService testService = context.getBean(TestServiceImpl.class);
//        testService.test("a","b");

        System.out.println("context 启动成功");

        // 从 context 中取出我们的 Bean，而不是用 new这种方式
//        TestBean bean = context.getBean(TestBean.class);
//        bean.setField("a");
//        bean = context.getBean(TestBean.class);
//        System.out.println(bean.getField());
        Test2 bean = context.getBean(Test2.class);
        System.out.println(bean.getClass());
        bean.doSth();
        bean.doSth();
        //context.getBean(Test2.class).doSth();




    }
}
