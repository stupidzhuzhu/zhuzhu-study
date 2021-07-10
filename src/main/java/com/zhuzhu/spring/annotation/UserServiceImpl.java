package com.zhuzhu.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: study
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-10 17:23
 **/
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public boolean addUser() {
		System.out.println("[UserService] begin to add user...");
		return userDao.addUser();
	}
}
