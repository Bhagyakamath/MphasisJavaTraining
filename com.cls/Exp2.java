package com.cls;
import java.util.*;
public class Exp2 {

	public static void main(String[] args) {
		LinkedList data=new LinkedList();
		data.add(10); //adding data
		data.add("java");
		data.add(10);
		data.add(20);
		data.add(50.4f);
		data.add(98l);
		data.add(true);
		data.add('A');
		System.out.println(data);
		System.out.println(data.size());
		data.set(0, "Hi"); //replacing or updating data
		System.out.println(data);
		data.remove(5); //removing or deleting data
		System.out.println(data);
		System.out.println(data.get(6)); //retrieving the data
		System.out.println(data.contains(1000)); //checking the presence of data
		System.out.println(data.getFirst()); //retrieving first data
		System.out.println(data.getLast()); //retrieving last data
		Iterator itr=data.iterator(); //Iterator is a interface
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ListIterator ltr=data.listIterator();
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		
		

	}

}
