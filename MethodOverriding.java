package com.test;

public class MethodOverriding {
	int x=10;

	public static void main(String[] args) {
		MethodOverriding m=new MethodOverriding();
		m.draw();
		Exp e=new Exp();
		e.draw();

	}
	public void draw() {
		System.out.println("Circle");
	}

}
class Exp extends MethodOverriding{
	public void draw() {
		System.out.println("Triangle");
	}
}
