package com.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		Map<Character, String> m=new LinkedHashMap<Character, String>();
		m.put('O',"Killing");
		m.put('G',"It");
		m.put('N',"Up");
		m.put('I',"Brutual");
		Set<Entry<Character, String>> s=m.entrySet();
		for(Entry<Character,String> str:s)
			System.out.println(str);
	}

}
