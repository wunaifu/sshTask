package com.wnf.test;

/**
 * Created by Administrator on 2018-01-09.
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ATask implements IATask {

//
//    总共有7个参数  秒、分、小时、月内日期、月、周内日期、年（可选字段）
//
    @Scheduled(cron="0 4,5,6,7,8,9 15 * * ?")
    public void aTask() {
//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        System.out.println(df.format(new Date()) + "********每天15点执行******");
//        System.out.println(df.format(new Date()) + "********A任务每10秒执行一次进入测试");
    }

}
