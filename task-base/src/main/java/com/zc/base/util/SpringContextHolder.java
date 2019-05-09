package com.zc.base.util;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


/**
 * 静态引用ApplicationContext,方便在类中使用.最好配置为单例.
 */
public class SpringContextHolder implements ApplicationContextAware, DisposableBean {

	private static ApplicationContext applicationContext = null;

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
    public void setApplicationContext(ApplicationContext applicationContext) {
		SpringContextHolder.applicationContext = applicationContext;
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name) {
		return (T) applicationContext.getBean(name);
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> requiredType) {
		String[] beanNames = applicationContext.getBeanNamesForType(requiredType);
		if (beanNames != null && beanNames.length > 0) {
			return (T) applicationContext.getBean(beanNames[0]);
		}

		return null;
	}

	@Override
    public void destroy() throws Exception {
		applicationContext = null;
	}
}