package com.test;

public class ConstructorDemo {
	public static void main(String args[]) {
		Employee obj1=new Employee();
		Employee obj2=new Employee(10, "Hi");
		Employee obj3=new Employee(obj1);
		Employee obj4=obj1.getObj(obj2);
	}

}

class Employee{
	public Employee() {
		System.out.println("Default constructor");
	}
	public Employee(int x, String s) {
		System.out.println("Parameterised constructor");
	}
	public Employee(Employee obj) {
		System.out.println("Object parameterised constructor");
	}
	//factory method
	public Employee getObj(Employee emp) {
		if(emp==null) {
			emp=new Employee();
		}
		System.out.println("Object created");
		return emp;
	}
	public Employee getInstance() {
		return new Employee();
	}
}
