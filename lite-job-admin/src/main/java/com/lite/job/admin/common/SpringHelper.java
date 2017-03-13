package com.lite.job.admin.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by junqing.li on 16/4/22.
 */
public class SpringHelper implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		SpringHelper.applicationContext = applicationContext;

	}

	public static <T> T getBean(String name, Class<T> requiredType) {

		return applicationContext.getBean(name, requiredType);

	}

	public static <T> T getBean(Class<T> requiredType) {
        if (requiredType == ApplicationContext.class) {
            return (T)applicationContext;
        }
		return applicationContext.getBean(requiredType);
	}

}
