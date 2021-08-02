package com.ConstructorInjection.AmbiguityProblem;

public class Addition {
	public Addition(int a, int b) {
		System.out.println("Inside int constructor");
	}
	public Addition(double a, double b) {
		System.out.println("inside double constructor");
	}
	public Addition(String a, String b) {
		System.out.println("inside string constructor");
	}
	public Addition(double a, int b) {
		System.out.println("Inside mixed constructor");
		System.out.println("This is a(double): " + a);
		System.out.println("This is b: " + b);
	}
}
