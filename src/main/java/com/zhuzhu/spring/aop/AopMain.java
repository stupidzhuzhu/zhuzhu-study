package com.zhuzhu.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: aop
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-12 23:10
 **/
public class AopMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
		IStudentService studentService = applicationContext.getBean("studentServiceImpl", IStudentService.class);
		studentService.addStudent();
	}
}
