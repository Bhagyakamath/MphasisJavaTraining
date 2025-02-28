package com.test;

public class MultipleInheritance {

	public static void main(String[] args) {
		impl obj=new impl();
		obj.cat();
		obj.dog();
		obj.fox();
		obj.tiger();

	}

}
//interface p1{
//	
//}
//interface p2{
//	
//}
//interface c extends p1, p2{
//	
//}


interface inf{
	void fox();
	void tiger();
}
abstract class abs{
	public void dog() {
		System.out.println("Abstraction implemented");
	}       
	public abstract void cat();
}
class impl extends abs implements inf{
	public void cat() {
		System.out.println("abs method overrided ");
	}
	public void fox() {
		System.out.println("inf fox() overrided ");
	}
	public void tiger() {
		System.out.println("inf tiger() overrided ");
	}
}