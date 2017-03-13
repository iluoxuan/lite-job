package com.lite.job.admin.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by junqing.li on 17/3/12.
 */
@Data
public class JobGroovyInfo {

	/** jobid **/
	private Integer jobId;

	/** groovy 实现代码 **/
	private String groovyCode;

	private Date createTime;

	private Date updateTime;
}
