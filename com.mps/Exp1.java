package com.mps;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Exp1 {

	public static void main(String[] args) {
		//Map data=new HashMap();
		LinkedHashMap data=new LinkedHashMap();
		data.put("java", "java");
		data.put(101, "Java");
		data.put(33, 33);
		data.put('a', 'a');
		data.put(101, "Hi");//No duplicate keys in map
		System.out.println(data);
		Iterator<Entry> itr=data.entrySet().iterator();
		while(itr.hasNext()) {
			Entry et=itr.next();
			System.out.println(et.getKey()+" --->"+et.getValue());
		}

	}

}
