package com.test;

public class Blocks {
	
	public static void main(String[] args) {
		
		System.out.println("from main()");
		Blocks b=new Blocks();
		Book obj=new Book();
		int a=obj.add(10, 10);
		System.out.println(a);

	}
	public Blocks() {
		System.out.println("Constructor Blocks");
	}
	{
		System.out.println("Instance block Blocks");
	}
	static {
		System.out.println("Static block Blocks");
	}

 
}

class Book{
	public Book() {
		System.out.println("Constructor");
	}
	{
		System.out.println("Instance block");
	}
	static {
		System.out.println("Static block");                                                             
	}
	public int add(int x, int y) {
		return x+y;
	}
}
