package com.GetterSetterInjection.CollectionsInjection.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xac = new ClassPathXmlApplicationContext(
				"com/GetterSetterInjection/CollectionsInjection/set/config.xml");
		Fish fish1 = (Fish)xac.getBean("fish1");
		System.out.println(fish1.getGenusName() + " : " + fish1.getSpeciesName());
		Fish fish2 = (Fish)xac.getBean("fish2");
		System.out.println(fish2.getGenusName() + " : " + fish2.getSpeciesName());
		xac.close();
	}
}
