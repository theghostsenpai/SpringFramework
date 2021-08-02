package com.GetterSetterInjection.CollectionsInjection.map;

import java.util.Map;

public class Student {
	private Map<Integer, String[]> studentDetails;

	public Map<Integer, String[]> getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(Map<Integer, String[]> studentDetails) {
		this.studentDetails = studentDetails;
	}
}
