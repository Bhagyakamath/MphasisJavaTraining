package com.test;

public class StringReverse {

	public static void main(String[] args) {
		String s="Hello";
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev+=s.charAt(i);
		}
		System.out.println(rev);
		
		
		
		//StringBuffer
		StringBuffer sb=new StringBuffer("java");
		sb.append(" 23");
		System.out.println(sb);
		System.out.println(sb.substring(1,4));
		String str="hello";
		StringBuffer sb1=new StringBuffer("Hi");
		System.out.println(sb1.reverse());

	}

}
