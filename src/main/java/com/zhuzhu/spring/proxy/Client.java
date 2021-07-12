package com.zhuzhu.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: proxy
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-12 20:49
 **/
public class Client {
	public static void main(String[] args) {
		/**
		 * 静态代理：便于扩展，符合开闭原则。
		 */
		IStudentService studentServiceProxy = new StudentServiceProxy(new StudentServiceImpl());
		studentServiceProxy.addStudent();

		System.out.println("\n*********************************\n");

		StudentServiceProxy proxy = (StudentServiceProxy) studentServiceProxy;
		proxy.checkStudentInfo();
		proxy.addStudent();

		System.out.println("\n*********************************\n");

		IStudentService studentService = new StudentServiceImpl();
		InvocationHandler myInvocationHandler = new MyinvocationHandler(studentService);
		IStudentService studentServiceDynamicProxy = (IStudentService) Proxy.newProxyInstance(myInvocationHandler.getClass().getClassLoader(), studentService.getClass().getInterfaces(), myInvocationHandler);
		studentServiceDynamicProxy.addStudent();
	}
}
