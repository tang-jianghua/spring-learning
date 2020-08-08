package com.springmvc.learning.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author tangjianghua
 * date 2020/5/18
 * time 10:25
 */
@Component
public class TestSchedule {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Scheduled(cron = "0/1 * * * * ?")
    public void  test() throws Exception{
        logger.info("test---start");
        Thread.sleep(1000);
//        logger.info("test---end");
    }
    @Scheduled(cron = "0/1 * * * * ?")
    public void  test2() throws Exception{
        logger.info("test2---start");
        Thread.sleep(1000);
//        logger.info("test2---end");
    }
    @Scheduled(cron = "0/1 * * * * ?")
    public void  test3() throws Exception{
        logger.info("test3---start");
        Thread.sleep(1000);
//        logger.info("test2---end");
    }


}
