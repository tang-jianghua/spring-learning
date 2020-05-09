package com.springmvc.learning.listener;

import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContext;

/**
 * @author tangjianghua
 * date 2020/5/9
 * time 11:09
 */
public class CustomizeContextLoaderListener extends ContextLoaderListener {

    @Override
    /**
     * 自定义上下文
     * 1.设置bean不可覆盖
     * @param servletContext
     * @param applicationContext
     * @return void
     * @author tangjianghua
     * date 2020/5/9
     */
    protected void customizeContext(ServletContext servletContext, ConfigurableWebApplicationContext applicationContext) {
        super.customizeContext(servletContext, applicationContext);
        AbstractRefreshableApplicationContext arac = (AbstractRefreshableApplicationContext) applicationContext;
        arac.setAllowBeanDefinitionOverriding(false);
    }

}
