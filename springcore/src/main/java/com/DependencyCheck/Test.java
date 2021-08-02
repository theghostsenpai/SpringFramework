package com.DependencyCheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/DependencyCheck/config.xml");
		Prescription prescription = (Prescription)context.getBean("prescription");
		System.out.println(prescription);
		context.close();
	}

}
