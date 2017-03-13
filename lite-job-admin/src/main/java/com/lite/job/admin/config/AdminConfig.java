package com.lite.job.admin.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * Created by junqing.li on 17/3/13.
 */
@EnableAsync
@Configurable
public class AdminConfig {


	@Bean
	@Qualifier("liteJobExecutor")
	public TaskExecutor taskExecutor() {

		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(15);
		executor.setMaxPoolSize(15);
		executor.setQueueCapacity(10000);
		executor.setThreadNamePrefix("lite-job-executor-");
		executor.initialize();
		return executor;
	}
}
