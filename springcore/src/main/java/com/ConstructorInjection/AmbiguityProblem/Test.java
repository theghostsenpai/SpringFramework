package com.ConstructorInjection.AmbiguityProblem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/ConstructorInjection/AmbiguityProblem/config.xml");
		Addition addition = (Addition)context.getBean("add1");
	}

}
