package com.zhuzhu.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: proxy
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-12 20:57
 **/
public class MyinvocationHandler implements InvocationHandler {
	private Object service;

	public MyinvocationHandler(Object service) {
		this.service = service;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("[MyinvocationHandler] before dynamic proxy...");
		method.invoke(service, args);
		System.out.println("[MyinvocationHandler] after dynamic proxy...");
		return null;
	}
}
