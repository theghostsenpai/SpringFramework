package com.GetterSetterInjection.SimpleInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext xac = new ClassPathXmlApplicationContext("com/GetterSetterInjection/SimpleInjection/config.xml");
		Employees employees = (Employees)xac.getBean("employee1");
		System.out.println(employees.getId());
		System.out.println(employees.getName());
		xac.close();
	}

}
