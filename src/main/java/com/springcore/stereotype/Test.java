package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoConfig.xml");
		Student stud=context.getBean("student" , Student.class);

		System.out.println(stud);
		System.out.println(stud.getAddress());
		System.out.println(stud.getAddress().getClass().getName());
		System.out.println();
		
		
		
		
		
	};

}
