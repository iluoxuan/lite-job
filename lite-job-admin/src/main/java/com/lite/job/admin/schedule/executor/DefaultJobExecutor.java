package com.lite.job.admin.schedule.executor;

import org.apache.commons.lang3.StringUtils;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

import com.lite.job.admin.domain.JobInfo;
import com.lite.job.admin.zk.ZkService;

/**
 * Created by junqing.li on 17/3/13.
 */
@Component
public class DefaultJobExecutor implements JobExecutor {

	@Autowired
	@Qualifier("liteJobExecutor")
	private TaskExecutor liteJobExecutor;

	@Autowired
	private ZkService zkService;

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

		String shard = jobInfo.getShard();
		if (StringUtils.isNotBlank(shard)) {
			//TODO 分片
			return;
		}

		liteJobExecutor.execute(() -> {

		});

	}
}
