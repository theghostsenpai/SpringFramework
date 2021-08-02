package com.GetterSetterInjection.ReferenceTypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xac = new ClassPathXmlApplicationContext(
				"com/GetterSetterInjection/ReferenceTypes/config.xml");
		Student student1 = (Student)xac.getBean("student1");
		System.out.println(student1);
		xac.close();
	}
}
