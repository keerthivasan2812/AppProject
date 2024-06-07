package org.marklist;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Students extends Record{
	
	static Map<Integer,Integer> map=new LinkedHashMap();
	public static void main(String[] args) {
		
		Students s=new Students();
		
		
		
			
			map.put(1,s.maths(100) );
			map.put(2, s.science(67));
			map.put(3, s.tamil(78));
			map.put(4, s.english(87));
			
			
		Set<Entry<Integer, Integer>> e = map.entrySet();
		
		for (Entry<Integer, Integer> entry : e) {
			
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key);
			System.out.println();
			
		}
		
	}

}
