package com.GetterSetterInjection.CollectionsInjection.properties;

import java.util.Properties;

public class Employees {
	private int EmployeeID;
	private String EmployeeName;
	private Properties EmployeeDepartment;

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public Properties getEmployeeDepartment() {
		return EmployeeDepartment;
	}

	public void setEmployeeDepartment(Properties employeeDepartment) {
		EmployeeDepartment = employeeDepartment;
	}
}
