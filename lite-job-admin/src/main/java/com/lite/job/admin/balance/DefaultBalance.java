package com.lite.job.admin.balance;

import java.util.Collections;
import java.util.List;

import org.springframework.util.Assert;

/**
 * Created by junqing.li on 17/3/13.
 * 默认随机负载均衡策略
 */
public class DefaultBalance implements Balance {

	@Override
	public <S> S balance(List<S> s) {

		Assert.notEmpty(s, "balance list is empty");

		Collections.shuffle(s);

		return s.get(0);
	}
}
