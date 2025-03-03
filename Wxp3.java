package com.cls;
import java.util.Enumeration;
import java.util.Stack;
public class Wxp3 {
	public static void main(String args[]) {
	Stack data=new Stack();
	data.add(10); //adding data
	data.add("java");
	data.add(10);
	data.add(20);
	data.add(50.4f);
	data.add(98l);
	data.add(true);
	data.add('A');
	System.out.println(data);
	System.out.println(data.peek());
	System.out.println(data.push("King"));
	System.out.println(data);
	System.out.println(data.pop());
	System.out.println(data.search("jav"));  //If present +ve numbers
	System.out.println(data.isEmpty());
	System.out.println(data.empty());
	//data.clear();
	System.out.println(data);
	Enumeration itr=data.elements();
	while(itr.hasMoreElements()) {
		System.out.println(itr.nextElement());
	}
	}
	
}
