package com.lstfight.carrieroperatorproxy.controller;

import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>实现对任务的控制</p>
 * @author lst
 */
@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    private final Scheduler quartzScheduler;

    /**
     * 注入starter自动配置的scheduler
     * @param quartzScheduler starter自动配置的scheduler
     */
    @Autowired
    public ScheduleController(Scheduler quartzScheduler) {
        this.quartzScheduler = quartzScheduler;
    }

    @RequestMapping("pause/{job}")
    public String  pasue(@PathVariable(value = "job") String jobName) {
        try {
            quartzScheduler.pauseJob(new JobKey(jobName));
            return "成功暂停";
        } catch (SchedulerException e) {
            e.printStackTrace();
            return "shibai";
        }
    }

    @RequestMapping("resume/{job}")
    public String  resume(@PathVariable(value = "job") String jobName) {
        try {
            quartzScheduler.resumeJob(new JobKey(jobName));
            return "成功唤醒";
        } catch (SchedulerException e) {
            e.printStackTrace();
            return "shibai";
        }
    }
}
