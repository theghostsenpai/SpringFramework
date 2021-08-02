package com.GetterSetterInjection.CollectionsInjection.list;

import java.util.List;

public class Student {
	private int studentID;
	private String studentName;
	private List<String> subjectsChosen;

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<String> getSubjectsChosen() {
		return subjectsChosen;
	}

	public void setSubjectsChosen(List<String> subjectsChosen) {
		this.subjectsChosen = subjectsChosen;
	}

}
