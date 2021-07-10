package com.zhuzhu.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: annotation
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-10 17:35
 **/
public class AnnotationMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
		String[] beans = context.getBeanDefinitionNames();
		for (String bean : beans) {
			System.out.println("bean:" + bean);
		}
		UserController userControllerImpl = context.getBean("userControllerImpl", UserController.class);
		userControllerImpl.addUser();
	}
}
