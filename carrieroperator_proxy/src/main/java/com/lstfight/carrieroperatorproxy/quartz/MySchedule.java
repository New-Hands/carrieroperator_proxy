package com.lstfight.carrieroperatorproxy.quartz;

import org.quartz.SchedulerFactory;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>数据伪造任务调度器</p>
 * <p>使用内部类的方式？？</p>
 * @author lst
 */
public class MySchedule {
    private final SchedulerFactory schedulerFactory;

    @Autowired
    public MySchedule(SchedulerFactory schedulerFactory) {
        this.schedulerFactory = schedulerFactory;
    }



}
