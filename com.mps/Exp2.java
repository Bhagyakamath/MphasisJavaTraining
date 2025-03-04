package com.mps;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Exp2 {

	public static void main(String[] args) {
		TreeMap<String, Integer> data=new TreeMap<>();
		data.put("lenovo", 300);
		data.put("sony", 450);
		data.put("lenovo", 250);
		data.put("dell", 300);
		data.put("asus", 750);
		data.put("apple", 570);
		data.put("ipad", 790);
		data.put("apple", 850);
		System.out.println(data.size());
		System.out.println(data);
		System.out.println();
		Iterator<Entry<String, Integer>> itr=data.entrySet().iterator();
		while(itr.hasNext()) {
			Entry et=itr.next();
			System.out.println(et.getKey()+" --->"+et.getValue());
		}
		System.out.println();
		for(String k: data.keySet()) {
			System.out.println(k+" "+data.get(k));
		}
		System.out.println();
		for(Integer x: data.values()) {
			System.out.println(x);
		}
		System.out.println();
		//java 8 feature
		data.forEach((k,v)->System.out.println(k+" "+v));

	}

}
