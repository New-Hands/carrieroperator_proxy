package com.lstfight.carrieroperatorproxy.quartz;

import org.quartz.*;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * <p>定义伪造流量使用记录的具体工作内容</p>
 * <p>根据什么来伪造使用记录</p>
 *
 * @author lst
 */
public class ForgeryJob extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("我是"+jobExecutionContext.getMergedJobDataMap().getString("who"));
    }
}
