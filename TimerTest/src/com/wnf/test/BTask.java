package com.wnf.test;

/**
 * Created by Administrator on 2018-01-09.
 */

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class BTask implements IBTask {

    @Scheduled(cron="0/30 * * * * ?")
    public void bTask() {
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()) + "********B任务每30秒执行一次进入测试");
    }

}
