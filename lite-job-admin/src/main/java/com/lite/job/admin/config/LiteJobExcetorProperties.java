package com.lite.job.admin.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by junqing.li on 17/3/13.
 */
@Configurable
@ConfigurationProperties("litejob.excetor")
public class LiteJobExcetorProperties {

	private Integer corePoolSize;

	private Integer maxPoolSize;

	private Integer queueCapacity;
}
