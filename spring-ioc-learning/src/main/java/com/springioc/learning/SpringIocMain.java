package com.springioc.learning;

import com.springioc.learning.beans.TestBean;
import com.springioc.learning.spring1_2.aop.TestService;
import com.springioc.learning.spring1_2.aop.TestServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author tangjianghua
 * date 2020/5/8
 * time 9:56
 */
public class SpringIocMain {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application1.2.xml");

//        FileSystemXmlApplicationContext
//        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:D:\\software\\spring-learning\\spring-ioc-learning/src/main/resources/application.xml");

//       注解模式
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);


        System.out.println("context 启动成功");

        // 从 context 中取出我们的 Bean，而不是用 new这种方式
//        TestBean bean = context.getBean(TestBean.class);
//        bean.setField("a");
//        bean = context.getBean(TestBean.class);
//        System.out.println(bean.getField());

        TestService testService = (TestService)context.getBean("testServiceImpl");
        testService.test();
    }
}
