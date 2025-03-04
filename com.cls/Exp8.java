package com.cls;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exp8 {

	public static void main(String[] args) {
		//Collection data=new TreeSet();
		//Set data=new TreeSet();
		TreeSet<String> data=new TreeSet<>();
		data.add("Java");
		data.add("Hi");
		data.add("Hello");
		data.add("Kohli");
		data.add("Rohit");
		data.add("Dhoni");
		data.add("JK");
		data.add("Java");
		System.out.println(data);
		System.out.println(data.reversed());
		
		Iterator<String> itr=data.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		data.forEach(x->System.out.println(x));
		System.out.println();
		System.out.println(data.subSet("Dhoni", "Java")); //Give the start and end string of subset alphabetically(Dhoni first then Hi)

	}

}
