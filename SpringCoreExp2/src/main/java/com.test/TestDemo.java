package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
//		Student obj=ctx.getBean("std", Student.class);
//		System.out.println(obj);
		
		/*ApplicationContext ctx1=new AnnotationConfigApplicationContext(StdConfig.class);
		Student obj1= (Student)ctx1.getBean("getStd1", Student.class);
		obj1.setId(2);
		obj1.setName("Alice");
		List<String> skills=Arrays.asList("Java", "Python");
		obj1.setSkills(skills);
		System.out.println(obj1);*/
		
		//Order obj=new Order(101. "Apple", 500);
		//System.out.println(obj.id()+" "+obj.name()+" "+obj.price());
		
		ApplicationContext ctx1=new AnnotationConfigApplicationContext(StdConfig.class);
		Order obj1= (Order)ctx1.getBean("getOrderObj", Order.class);
		System.out.println(obj1);
		
		
		
	}

}
