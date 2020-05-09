package com.springmvc.learning.filters;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author tangjianghua
 * date 2020/4/30
 * time 10:13
 */
public class TestFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.debug("-------------------init-------------");
        logger.debug("filterConfig:{}", JSON.toJSONString(filterConfig));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.debug("-------------------doFilter-------------");
        logger.debug("filterChain:{}", JSON.toJSONString(filterChain));
    }

    @Override
    public void destroy() {
        logger.debug("-------------------destroy-------------");
    }
}
