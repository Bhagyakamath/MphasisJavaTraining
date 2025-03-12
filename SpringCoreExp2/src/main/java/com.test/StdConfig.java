package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StdConfig {
	
	
	@Bean
	public static Student getStd1() {
		return new Student();
	}
	
	@Bean
	public static Order getOrderObj() {
		return new Order(500, "Pen", 80);
	}
	

}
