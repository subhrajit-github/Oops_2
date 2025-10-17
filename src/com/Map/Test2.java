package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Map<String, Integer> m=new HashMap<String, Integer>();
		m.put("Ram",28);
		m.put("Sita",24);
		m.put("Laxman",25);
		m.put("Ravan",30);
		Set<String> s=m.keySet();
		for(String str:s)
			System.out.println(str+" = "+m.get(str));
	}

}
