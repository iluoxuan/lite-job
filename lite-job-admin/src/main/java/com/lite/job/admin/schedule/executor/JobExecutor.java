package com.lite.job.admin.schedule.executor;

import org.quartz.JobExecutionContext;

import com.lite.job.admin.domain.JobInfo;

/**
 * Created by junqing.li on 17/3/13.
 */
public interface JobExecutor {

	void executor(JobExecutionContext context, JobInfo jobInfo);
}
