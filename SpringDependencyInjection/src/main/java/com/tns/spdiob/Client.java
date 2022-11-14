package com.tns.spdiob;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tns.springDI.Student;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
    	 System.out.println("Config Loaded");
    	 Student1 s = c.getBean("s",Student1.class);
		 s.cheating();
		 
	   	 Student2 s1 = c.getBean("s1",Student2.class);
		 s1.StartCheating();
	}
 
}
