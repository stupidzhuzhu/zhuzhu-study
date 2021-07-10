package com.zhuzhu.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: study
 * @description:
 * @author: zhuzhu
 * @create: 2021-07-10 15:58
 **/
public class People {

	private Dog dog;

	@Autowired
	private Cat cat;

	private Pig pig;

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public Pig getPig() {
		return pig;
	}

	public void setPig(Pig pig) {
		this.pig = pig;
	}

	@Override
	public String toString() {
		return "People{" +
				"dog=" + dog +
				", cat=" + cat +
				", pig=" + pig +
				'}';
	}
}
