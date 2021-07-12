package com.zhuzhu.spring.aop;

import org.springframework.stereotype.Component;

/**
 * @program: aop
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-12 23:09
 **/
@Component
public class StudentServiceImpl implements IStudentService{
	@Override
	public void addStudent() {
		System.out.println("添加一个学生");
	}
}
