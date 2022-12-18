package org.task;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapQuest {
	public static void main(String[] args) {
		
		Map<String, String> mp=new Hashtable<>();
		
		mp.put("mani", "Java");
		mp.put("Nanda", "Sele");
		mp.put("Tanu", "C++");
		mp.put("Amudh", "Python");
		
		Set<String> keySet = mp.keySet();
		System.out.println(keySet);
				
				
		
		
		
	}

}
