package com.springioc.learning.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author tangjianghua
 * @date 2020/7/8
 */
public class Test2 implements  ApplicationContextAware, BeanFactoryAware {

    ApplicationContext applicationContext;
    BeanFactory beanFactory;
 /*   TestBean testBean;

    public TestBean getTestBean() {
        return testBean;
    }

    public void setTestBean(TestBean testBean) {
        this.testBean = testBean;
    }*/

/*
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization--------"+applicationContext.getBean(Test2.class).getClass());
        return null;
    }
*/

    public void doSth(){
        final TestBean bean = applicationContext.getBean(TestBean.class);
        bean.hello();
        final TestBean bean1 = beanFactory.getBean(TestBean.class);
        System.out.println(bean==bean1);
        System.out.println("doSth");
    }

 /*   @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization--------");
        return null;
    }*/

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Class<? extends Test2> aClass = applicationContext.getBean(Test2.class).getClass();
        System.out.println("setApplicationContext----"+applicationContext.getBean(Test2.class).getClass());
        this.applicationContext=applicationContext;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory----");
        this.beanFactory=beanFactory;
    }
}
