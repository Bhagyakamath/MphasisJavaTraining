package com.cls;
import java.util.*;
public class Exp4 {

	public static void main(String[] args) {
		ArrayList<String> listNames=new ArrayList<>();
		listNames.add("java");
		listNames.add("python");
		listNames.add("spring");
		listNames.add("hibernate");
//		Iterator<String> itr=listNames.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		ListIterator<String> ltr=listNames.listIterator();
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}


	}

}
