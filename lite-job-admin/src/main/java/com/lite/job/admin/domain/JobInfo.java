package com.lite.job.admin.domain;

import java.util.Date;

import lombok.Data;

/**
 * Created by junqing.li on 17/3/12.
 */
@Data
public class JobInfo {

	private Integer id;

	private String group;

	private String name;

	private String clazz;

	/** 1-正常类型 2-groovy 3-shell **/
	private Integer type;

	private String param;

	/** 表达式 **/
	private String cron;

	private String status;

	/** 报警邮件 **/
	private String email;

	/** jobId 1,2,3 **/
	private String nextJobId;

	/** 下次触发执行时间 **/
	private Date nextFireTime;

	private String createTime;

	private String updateTime;
}
