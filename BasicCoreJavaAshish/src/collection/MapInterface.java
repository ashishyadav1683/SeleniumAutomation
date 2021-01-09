package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {

		Map <Integer,String> map = new HashMap<>();
		map.put(1, "Ashish");
		map.put(2, "Ravish");
		map.put(3, "hakkina");
				
		//System.out.println(map.get(3));
		
		Set<Integer> keys = map.keySet();
		
		for(int key:keys)
		{
			System.out.println(map.get(key));
		}
		
	}

}
