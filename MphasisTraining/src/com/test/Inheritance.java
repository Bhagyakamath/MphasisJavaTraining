package com.test;

public class Inheritance {

	public static void main(String[] args) {
//		B obj=new B();
		C obj=new C();
		obj.method3();
		obj.stdInfo();
		obj.userDetails();
//		A obja=new A();
//		C objc=obja; //Can't cast parent to child. Parent can't refer to child
		

	}

}

class A{
	int id=101;
	String name="Rohit";
	public void userDetails() {
		System.out.println("ID: "+id+" Name: "+name);
	}
}
class B extends A{
	String city="Chennai";
	public void stdInfo() {
		System.out.println("ID: "+id+" Name: "+name+" City: "+city);
	}
}
class C extends B{
	public void method3() {
		System.out.println("Hi");
	}
}