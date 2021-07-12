package com.zhuzhu.spring.proxy;

/**
 * @program: proxy
 * @description:
 * @author: sunwenjie
 * @create: 2021-07-12 20:49
 **/
public class StudentServiceProxy implements IStudentService{

	private IStudentService studentService;

	public StudentServiceProxy(IStudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	public void addStudent() {
		System.out.println("[before] 添加学生前");
		studentService.addStudent();
		System.out.println("[after] 添加学生后");
	}

	public void checkStudentInfo() {
		System.out.println("[checkStudentInfo] 校验学生信息...");
	}
}
