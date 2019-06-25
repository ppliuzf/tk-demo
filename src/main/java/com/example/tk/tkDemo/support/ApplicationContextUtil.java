package com.example.tk.tkDemo.support;

import com.szx.core.exception.GlobalRuntimeException;
import com.szx.core.utils.AppServiceHelper;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext appCtxIn){
		applicationContext=appCtxIn;
		AppServiceHelper.setApplicationContext(appCtxIn);
	}


	public static Object findBean(String beanId) throws GlobalRuntimeException {

		Object service = null;
		try {
			service = applicationContext.getBean(beanId);
		} catch (NoSuchBeanDefinitionException ex) {
			throw new GlobalRuntimeException("no such bean for["+beanId+"]", ex);
		} catch (BeansException ex) {
			throw new GlobalRuntimeException("bean exception for["+beanId+"]", ex);
		}
		return service;
	}

	public static <T> T findBean(String beanId,Class<T> clazz) throws GlobalRuntimeException {

		T service = null;
		try {
			service = applicationContext.getBean(beanId,clazz);
		} catch (NoSuchBeanDefinitionException ex) {
			throw new GlobalRuntimeException("no such bean for["+beanId+"]", ex);
		} catch (BeansException ex) {
			throw new GlobalRuntimeException("bean exception for["+beanId+"]", ex);
		}
		return service;
	}

	public static <T> T findBean(Class<T> clazz) throws GlobalRuntimeException {

		T service = null;
		try {
			service = applicationContext.getBean(clazz);
		} catch (NoSuchBeanDefinitionException ex) {
			throw new GlobalRuntimeException("no such bean for["+clazz+"]", ex);
		} catch (BeansException ex) {
			throw new GlobalRuntimeException("bean exception for["+clazz+"]", ex);
		}
		return service;
	}

}
