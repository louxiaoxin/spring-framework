package com.lxx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		User user = context.getBean(User.class);
		System.out.println(user);
	}
}
