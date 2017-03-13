package com.lite.job.admin.domain;

import java.util.Date;

import lombok.Data;

/**
 * Created by junqing.li on 17/3/13.
 */
@Data
public class ZkJobConfig {

	private String jobName;

	@Data
	public static class ZkJobInfo {

		private String ip;

		private Integer status;

		private Date fireTime;

		private Date nextFireTime;

	}
}
