package com.lite.job.admin.domain;

/**
 * Created by junqing.li on 17/3/12.
 */
public enum JobStatus {

	NORMAL(1, "默认"),

	PAUSE(2, "暂停"),

	RESUME(3, "重启"),

	DELETE(4, "删除"),

	;

	private int status;

	private String desc;

	JobStatus(int status, String desc) {
		this.status = status;
		this.desc = desc;
	}
}
