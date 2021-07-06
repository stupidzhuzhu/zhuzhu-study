package com.zhuzhu.spring;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @program: study
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-06 16:51
 **/
public class Student {

	private String name;
	private Teacher teacher;
	private String[] friends;
	private List<String> subjects;
	private Map<String, String> books;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String[] getFriends() {
		return friends;
	}

	public void setFriends(String[] friends) {
		this.friends = friends;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Map<String, String> getBooks() {
		return books;
	}

	public void setBooks(Map<String, String> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", teacher=" + teacher +
				", friends=" + Arrays.toString(friends) +
				", subjects=" + subjects +
				", books=" + books +
				'}';
	}
}
