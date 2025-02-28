package com.test;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.add(10, 20);
		m.add(30l, 9.7f);
		m.add(10.2f, 67l);

	}
	public void add(int x, int y) {
		System.out.println("Number of args");
	}
	public void add(long x, float y) {
		System.out.println("Type of args");
	}
	public void add(float y, long x) {
		System.out.println("Order of args");
	}

}
