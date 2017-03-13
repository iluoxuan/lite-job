package com.lite.job.admin.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by junqing.li on 17/3/12.
 *
 * job事件触发log
 */
@Data
public class JobEventLog {

	private Integer jobId;

	private String jobName;

	private String jobGroup;

	private Integer status;

	private Date fireTime;

}
