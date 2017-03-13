package com.lite.job.admin.schedule;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.lite.job.admin.common.SpringHelper;
import com.lite.job.admin.domain.JobInfo;
import com.lite.job.admin.schedule.executor.JobExecutor;

/**
 * Created by junqing.li on 17/3/13.
 * quartz job 代理入口类
 * quartz job触发 每次都会执行execute方法
 * 触发的时候更新 zookeeper
 */
public class QuartzJobAgent implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {

		JobDataMap jobDataMap = context.getMergedJobDataMap();
		JobInfo jobInfo = (JobInfo) jobDataMap.get(Constants.DATA_JOB_INFO);
		SpringHelper.getBean(JobExecutor.class).executor(context, jobInfo);
	}
}
