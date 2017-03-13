package com.lite.job.admin.balance;

import java.util.List;

/**
 * Created by junqing.li on 17/3/13.
 * 负载均衡
 */
public interface Balance {

	/**
	 * 负载均衡
	 * 根据 所有的选取一个折行
	 * 
	 * @param s
	 * @return
	 */
	<S> S balance(List<S> s);
}
