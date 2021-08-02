package com.ConstructorInjection.SimpleInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ConstructorInjection/SimpleInjection/config.xml");
		Employee emp = (Employee)context.getBean("Employee");
		System.out.println(emp);
		context.close();
	}

}
