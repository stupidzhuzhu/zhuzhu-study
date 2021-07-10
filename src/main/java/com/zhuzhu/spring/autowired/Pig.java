package com.zhuzhu.spring.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @program: study
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-10 16:54
 **/
@Configuration

// @Component 对比 @Component和@Configuration的区别
public class Pig {

	@Bean(name = "createPig")
	public Pig createPig() {
		return this;
	}
}
