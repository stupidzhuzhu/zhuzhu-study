package com.zhuzhu.spring.annotation;

import org.springframework.stereotype.Repository;

/**
 * @program: study
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-10 17:21
 **/
@Repository
public class UserDaoImpl implements UserDao{
	@Override
	public boolean addUser() {
		System.out.println("[UserDao] add user to DB");
		return true;
	}
}
