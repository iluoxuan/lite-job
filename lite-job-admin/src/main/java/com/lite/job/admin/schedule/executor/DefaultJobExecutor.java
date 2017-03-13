package com.lite.job.admin.schedule.executor;

import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.stereotype.Component;

import com.lite.job.admin.domain.JobInfo;

/**
 * Created by junqing.li on 17/3/13.
 */
@Component
public class DefaultJobExecutor implements JobExecutor {

	@Autowired
	private AsyncTaskExecutor taskExecutor;

	/**
	 * 执行步骤
	 * 1 -- 判断类型
	 * 2 -- 触发类型 更新zookeeper
	 * 
	 * @param context
	 * @param jobInfo
	 */
	@Override
	public void executor(JobExecutionContext context, JobInfo jobInfo) {

	}
}
