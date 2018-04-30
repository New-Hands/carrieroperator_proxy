package com.lstfight.carrieroperatorproxy.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * <p>针对性的数据伪造任务</p>
 * <p>??JobExecutionException</p>
 *
 * @author lst
 */
public class ParticularForgeryJob extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println("特别执行"+context.getMergedJobDataMap().getString("name"));
    }
}
