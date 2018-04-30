package com.lstfight.carrieroperatorproxy.quartz;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>任务配置类，可以配置多任务</p>
 * @author lst
 *
 */
@Configuration
public class Manager {
    @Bean
    public JobDetail forgeryJobDetail() {
        return JobBuilder.newJob(ForgeryJob.class)
                .withIdentity("forgeryJob").usingJobData("who","lst")
                .storeDurably()
                .build();
    }

    @Bean
    public JobDetail sampleJobDetail() {
        return JobBuilder.newJob(ParticularForgeryJob.class)
                .withIdentity("sampleJob").usingJobData("name","sample")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger forgeryTrigger() {
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(2).repeatForever();

        return TriggerBuilder.newTrigger()
                .forJob(forgeryJobDetail())
                .withIdentity("forgeryTrigger")
                .withSchedule(scheduleBuilder)
                .build();
    }

    @Bean
    public Trigger sampleTrigger() {
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(2).repeatForever();

        return TriggerBuilder.newTrigger()
                .forJob(sampleJobDetail())
                .withIdentity("sampleTrigger")
                .withSchedule(scheduleBuilder)
                .build();
    }

}
