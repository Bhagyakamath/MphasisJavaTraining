package com.test;

public class AgeValidater {
	public void checkAge(int age) throws ValidAgeException,InvalidAgeException{
		if(age>=18) {
			ValidAgeException ve=new ValidAgeException("Eligible");
			throw(ve);
		}
		else {
			InvalidAgeException ve=new InvalidAgeException("Not eligible");
			throw(ve);                           
		}
	}
}
