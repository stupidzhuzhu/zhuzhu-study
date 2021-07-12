package com.zhuzhu.spring.proxy;

/**
 * @program: proxy
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-12 20:47
 **/
public class StudentServiceImpl implements IStudentService{
	@Override
	public void addStudent() {
		System.out.println("[addStudent] 添加一个学生");
	}
}
