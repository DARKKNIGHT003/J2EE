package com.tns.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("Config Loaded");
		//VI v = (VI)c.getBean("VI");
		Sim s = c.getBean("Sim",Sim.class);
		s.calling();
		s.data();
	
	}
	

}
