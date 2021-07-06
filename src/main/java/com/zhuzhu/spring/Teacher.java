package com.zhuzhu.spring;

/**
 * @program: study
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-06 16:52
 **/
public class Teacher {
	private int id;

	public Teacher() {
	}

	public Teacher(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"id=" + id +
				'}';
	}
}
