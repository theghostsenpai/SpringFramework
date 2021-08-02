package com.GetterSetterInjection.CollectionsInjection.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xac = new ClassPathXmlApplicationContext(
				"com/GetterSetterInjection/CollectionsInjection/list/config.xml");
		Student student = (Student) xac.getBean("student1");
		System.out.println(student.getStudentID() + " " + student.getStudentName() + " " + student.getSubjectsChosen());
		xac.close();
	}
}
