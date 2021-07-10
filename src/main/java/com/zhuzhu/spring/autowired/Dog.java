package com.zhuzhu.spring.autowired;

import org.springframework.beans.factory.annotation.Value;

/**
 * @program: study
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-10 15:58
 **/
public class Dog {
	@Value("大黄")
	private String name;

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				'}';
	}
}
