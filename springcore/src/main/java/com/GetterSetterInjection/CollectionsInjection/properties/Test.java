package com.GetterSetterInjection.CollectionsInjection.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xac = new ClassPathXmlApplicationContext(
				"com/GetterSetterInjection/CollectionsInjection/properties/config.xml");
		Employees emp1 = (Employees) xac.getBean("Emp1");
		System.out.println("Employee id: " + emp1.getEmployeeID() + " Employee Name: " + emp1.getEmployeeName());
		System.out.println("Employee eligible departments: " + emp1.getEmployeeDepartment());
	}
}
