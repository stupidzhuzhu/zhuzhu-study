package com.zhuzhu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: study
 * @description: spring读取xml配置文件
 * @author: zhuzhu
 * @create: 2021-07-06 10:42
 **/
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Human human  = (Human) context.getBean("human");
		Human zhuzhu  = (Human) context.getBean("zhuzhu");
		Human human1  = (Human) context.getBean("human1");

		System.out.println(human);
		System.out.println(zhuzhu);

		System.out.println(human1);
	}
}
