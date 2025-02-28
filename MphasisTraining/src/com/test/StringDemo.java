package com.test;

public class StringDemo {

	public static void main(String[] args) {
		String str1="java";
		String str2="java";
		String str3=new String("java");
		String str4=new String("java");
		String str5="Hello";
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		System.out.println(str1==str3);
		System.out.println(str2==str5);
		System.out.println(str1.equals(str3));
		System.out.println(str1);
		System.out.println(str1.concat(" version"));
	}

}
