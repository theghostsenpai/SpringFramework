package com.GetterSetterInjection.ReferenceTypes;

public class Student {
	private String studentName;
	private Scores scores;

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "[Student Name=" + studentName + ", Scores=" + scores + "]";
	}

}
