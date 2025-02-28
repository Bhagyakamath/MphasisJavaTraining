package com.test;

public class NestedInf {

	public static void main(String[] args) {
		Imp5 i=new Imp5();
		i.add();
		i.mul();

	}

}

interface Inf9{
	void add();
	interface Inf10{
	void mul();
	}
}
class Impl implements Inf9{
	public void add() {
		System.out.println("Add");
	}
}
class Imp5 implements Inf9.Inf10{
	public void add() {
		System.out.println("Add");
	}
	public void mul() {
		System.out.println("Multiplication");
	}
}

