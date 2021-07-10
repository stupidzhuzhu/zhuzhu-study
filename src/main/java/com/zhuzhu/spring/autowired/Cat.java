package com.zhuzhu.spring.autowired;

import org.springframework.beans.factory.annotation.Value;

/**
 * @program: study
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-10 15:58
 **/
public class Cat {
	@Value("小灰灰")
	private String name;

	public String getName() {
		return name;
	}
}
