package com.test;

public class InterfaceDemo {

	public static void main(String[] args) {
		Imp i=new Imp();
		i.human();
		i.animal();
		i.dog();
		i.cat();
		i.book();
		i.color();
		i.dance();

	}

}

interface Inf1{
	void human();
	void animal();
}
interface Inf2{
	void dog();
	void cat();
}
interface Inf3{
	void book();
	void color();
}
interface Inf4 extends Inf1, Inf2, Inf3{
	void dance();
}
class Imp implements Inf4{
	public void human() {
		System.out.println("Inf1 human()");
	}
	public void animal() {
		System.out.println("Inf1 animal()");
	}
	public void dog() {
		System.out.println("Inf2 dog()");
	}
	public void cat() {
		System.out.println("Inf2 cat()");
	}
	public void book() {
		System.out.println("Inf3 book()");
	}
	public void color() {
		System.out.println("Inf3 color()");
	}
	public void dance() {
		System.out.println("Inf4 dance()");
	}
}
