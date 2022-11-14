package com.tns.spdicol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
    	 System.out.println("Config Loaded");
    	 Employee emp = c.getBean("emp",Employee.class);
		 System.out.println(emp.getName());
		 System.out.println(emp.getPhones());
		 System.out.println(emp.getAddresses());
		 System.out.println(emp.getCourses());
		
	}
 
}
