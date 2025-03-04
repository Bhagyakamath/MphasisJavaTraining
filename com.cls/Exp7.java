package com.cls;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Exp7 {

	public static void main(String[] args) {
		//Collection data=new HashSet();
		//Set data=new HashSet();
		HashSet data=new HashSet();
		data.add("Java");
		data.add(10);
		data.add("Hello");
		data.add(3.4f);
		data.add(67l);
		data.add(true);
		data.add('A');
		data.add("Java"); //HashSet takes only unique values
		System.out.println(data);
		
		Iterator itr=data.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		data.forEach(x->System.out.println(x));
		
		
		LinkedHashSet d=new LinkedHashSet();
		

	}

}
