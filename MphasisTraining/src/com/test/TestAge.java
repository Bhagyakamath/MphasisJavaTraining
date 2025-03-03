package com.test;
import java.util.*;
public class TestAge {

	public static void main(String[] args) throws ValidAgeException, InvalidAgeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		AgeValidater obj=new AgeValidater();
		obj.checkAge(age);

	}

}

