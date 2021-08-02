package com.LifeCycleMethods.xmlConfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext xac = new ClassPathXmlApplicationContext(
				"com/LifeCycleMethods/xmlConfig/config.xml");
		Patient p = (Patient) xac.getBean("p1");
		System.out.println(p);
		xac.registerShutdownHook();
	}
}
