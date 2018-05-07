package com.lstfight.carrieroperatorproxy.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.Trigger;
import org.quartz.TriggerListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lst
 * Created on 2018/5/6.
 */
public class NormalListener implements TriggerListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(NormalListener.class);


    @Override
    public void triggerFired(Trigger trigger, JobExecutionContext context) {
        LOGGER.info(trigger.getKey().getName() + "正常触发");
    }

    @Override
    public void triggerComplete(Trigger trigger, JobExecutionContext context, Trigger.CompletedExecutionInstruction triggerInstructionCode) {
        LOGGER.info(trigger.getKey().getName() + "完成");
    }

    @Override
    public void triggerMisfired(Trigger trigger) {

    }

    @Override
    public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
        return false;
    }

    @Override
    public String getName() {
        return "normalListener";
    }
}

