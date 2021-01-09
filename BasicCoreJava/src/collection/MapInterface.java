package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {

		Map <Integer, String> map = new HashMap<>();
		
		map.put(1, "Ashish");
		map.put(2, "Danish");
		map.put(3, "Chetan");
		map.put(4, "Raj");
		
		//System.out.println(map.get(3));
		
		Set <Integer>keys =map.keySet();
		
		for(int key:keys)
		{
			System.out.println(map.get(key));
		}
		
		// Anand -true
		//Danish -false
		//Karishma -false
		//Mohit-true
		
		
		/*
		 * Map <String, Boolean> map1 = new HashMap<>();
		 * 
		 * map1.put("Anand", true); map1.put("Danish", false); map1.put("Karishma",
		 * false); map1.put("Mohit", true);
		 * 
		 * System.out.println(map1.get(3));
		 */
		
		

	}

}
