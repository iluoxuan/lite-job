package com.lite.job.admin.schedule;

import java.util.Date;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;

import com.lite.job.admin.domain.JobInfo;

/**
 * Created by junqing.li on 17/3/12.
 */
@Service
public class ScheduleService {

	@Autowired
	private SchedulerFactoryBean schedulerFactoryBean;

	/**
	 * schedule job
	 * 
	 * @param jobInfo
	 */
	public void addJob(JobInfo jobInfo) throws SchedulerException {

		Scheduler scheduler = schedulerFactoryBean.getScheduler();
		JobDetail jobDetail = JobBuilder.newJob(QuartzJobAgent.class).withIdentity(jobInfo.getName(), jobInfo.getGroup()).build();

		jobDetail.getJobDataMap().put(Constants.DATA_JOB_INFO, jobInfo);

		CronTrigger trigger = TriggerBuilder.newTrigger().forJob(jobDetail).withIdentity(jobInfo.getName(), jobInfo.getGroup())
				.withSchedule(CronScheduleBuilder.cronSchedule(jobInfo.getCron())).build();

		Date date = scheduler.scheduleJob(jobDetail, trigger);
	}

	public void pause() {

	}

	public void resume() {

	}

	public void delete() {

	}

	public void trigger() {

	}

}
