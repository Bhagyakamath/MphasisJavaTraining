package com.test;

public class FunInterface implements FunInf {

	public static void main(String[] args) {
		FunInterface f=new FunInterface();
		f.greetUser();
		f.animal();
		FunInf obj2=()->System.out.println("Java 8 new feature.");
		obj2.greetUser();

	}
	public void greetUser() {
		System.out.println("Abstract method");
	}

}

@FunctionalInterface
interface FunInf{
	void greetUser();  //only one abstract method
	static void human() {
		System.out.println("static");
	}
	default void animal() {
		System.out.println("default");
	}
	private void fox() {
		System.out.println("private");
	}
}