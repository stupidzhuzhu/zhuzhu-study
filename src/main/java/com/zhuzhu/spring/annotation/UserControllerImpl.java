package com.zhuzhu.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @program: study
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-10 17:26
 **/
@Controller
public class UserControllerImpl implements UserController{
	@Autowired
	private UserService userService;

	@Override
	public boolean addUser() {
		System.out.println("[UserController] receive add user request");
		return userService.addUser();
	}
}
