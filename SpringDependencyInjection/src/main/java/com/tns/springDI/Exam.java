package com.tns.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
     public static void main(String args[])
     {
    
    	 ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
    	 System.out.println("Config Loaded");
    	 Student s = c.getBean("s",Student.class);
	     s.display();
	 
    	 Student s1 = c.getBean("s1",Student.class);
	     s1.display();
}
     
}  