package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(18, "King");
		m.put(7, "Dhoni");
		m.put(45, "Hitman");
		m.put(1, "Kl");
		m.put(96, "Boom");
		System.out.println(m);
		Set<Integer> s=m.keySet();
		Iterator<Integer> i=s.iterator();
		while(i.hasNext()) {
			int key=i.next();
			String value=m.get(key);
			System.out.println(key+" = "+value);
		}
	}

}
