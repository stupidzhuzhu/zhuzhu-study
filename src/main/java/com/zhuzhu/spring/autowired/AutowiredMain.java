package com.zhuzhu.spring.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: autowired
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-10 16:05
 **/
public class AutowiredMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowired.xml");
		// autowired by name
		People people1 = applicationContext.getBean("people1", People.class);
		People people2 = applicationContext.getBean("people2", People.class);
		System.out.println(people1);
		System.out.println(people2);
		System.out.println("cat name:" + people1.getCat().getName());

		Dog dog = applicationContext.getBean("dog", Dog.class);
		System.out.println(dog);

		Pig pig = applicationContext.getBean("createPig", Pig.class);
		System.out.println(pig);
	}
}
