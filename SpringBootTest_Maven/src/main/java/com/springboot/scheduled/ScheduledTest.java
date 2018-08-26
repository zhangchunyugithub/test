package com.springboot.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @auther zhangchy
 * @create 2018/7/11
 */
@Service
public class ScheduledTest {

    @Scheduled(cron ="0 0/1 * * * ?" )
    public void task(){
        System.out.println(1111);
    }
}
