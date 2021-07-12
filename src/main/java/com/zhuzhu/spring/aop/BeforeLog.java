package com.zhuzhu.spring.aop;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @program: aop
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-12 23:03
 **/
@Component
public class BeforeLog implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("[before] " + method.getName() + "将被执行...");
	}
}
