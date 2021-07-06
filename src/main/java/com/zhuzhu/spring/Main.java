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

		System.out.println("********************************");

		Student student = (Student) context.getBean("student");
		System.out.println(student);

		System.out.println("********************************");

		Teacher teacher1 = context.getBean("teacher1", Teacher.class);
		Teacher teacher2 = context.getBean("teacher2", Teacher.class);
		System.out.println(teacher1);
		System.out.println(teacher2);
	}
}
