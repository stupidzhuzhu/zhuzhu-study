package com.zhuzhu.spring.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @program: aop
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-12 23:05
 **/
@Component
public class AfterLog implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("[after] " + method.getName() + "被执行完了...");
	}
}
