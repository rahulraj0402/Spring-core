package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");
		Emp emp1=(Emp)context.getBean("emp1");
		System.out.println("name : "+emp1.getName());
		System.out.println("address : "+emp1.getAddresses());
		System.out.println("courses : "+emp1.getCourses());
		System.out.println("phone no : " +emp1.getPhones());
		System.out.println("ptopes : "+emp1.getProps());
		System.out.println(emp1.getPhones().getClass());
	}

}
