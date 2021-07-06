package com.zhuzhu.spring;

/**
 * @program: study
 * @description: entity
 * @author: zhuzhu
 * @create: 2021-07-06 10:40
 **/
public class Human {
	private String name;

	public Human() {
	}

	public Human(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public String toString() {
//		return "Human{" +
//				"name='" + name + '\'' +
//				'}';
//	}
}
