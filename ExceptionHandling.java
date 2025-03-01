package com.test;

public class ExceptionHandling {
	public static void main(String args[]) {
		try {
		System.out.println("Hello");
		System.out.println(10/0); //ArithmeticException
		System.out.println("Java");
		
		int a[]= {10,20,30,40};
		System.out.println(a[5]); //ArrayIndexOutOfBoundsException
		
		String s=null;
		System.out.println(s.charAt(0)); //NullPointerException
		}
		catch(ArithmeticException ae){
			System.out.println("Don't enter zero for den");
		}
		catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("Check array soze");
		}
		catch(StringIndexOutOfBoundsException sie){
			System.out.println("Check string length");
		}
		catch(Exception e){
			System.out.println("Check your inputs");
		}
		finally {
			System.out.println("Print this anyway");
		}
	}
}
