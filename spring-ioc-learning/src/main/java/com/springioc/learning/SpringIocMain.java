package com.springioc.learning;

import com.springioc.learning.beans.TestBean;
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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

//        FileSystemXmlApplicationContext
//        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:D:\\software\\spring-learning\\spring-ioc-learning/src/main/resources/application.xml");

//       注解模式
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);


        System.out.println("context 启动成功");

        // 从 context 中取出我们的 Bean，而不是用 new这种方式
        TestBean bean = context.getBean(TestBean.class);
        bean.setField("a");
        bean = context.getBean(TestBean.class);
        System.out.println(bean.getField());
        context.refresh();
        bean = context.getBean(TestBean.class);
        System.out.println(bean.getField());
    }
}
