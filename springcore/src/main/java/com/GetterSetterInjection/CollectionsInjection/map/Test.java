package com.GetterSetterInjection.CollectionsInjection.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xac = new ClassPathXmlApplicationContext(
				"com/GetterSetterInjection/CollectionsInjection/map/config.xml");
		Student student = (Student) xac.getBean("student1");
		String[] names = student.getStudentDetails().get(59);
		System.out.println("FirstName: " + names[0]);
		System.out.println("LastName: " + names[1]);
		xac.close();
}
}
