package collection;

import java.util.*;

public class ListInterface {
	
	public static void main(String[] args) {
		
		// ArrayList default size is 10, once we reach the maximum level , it will expand by 50%
		
		List <String> list = new ArrayList<>(); // returns duplicate values also
		list.add("Ashish");
		list.add("Yogesh");
		list.add("Mohit");
		list.add("Amit");
		
		for(String i:list)
		{
			System.out.println(i);
		}
		
		System.out.println("********************************");
		
		list = new LinkedList<>();
		list.add("Ashish");
		list.add("Yogesh");
		list.add("Mohit");
		list.add("Amit");
		
		for(String i:list)
		{
			System.out.println(i);
		}
		
		System.out.println("***************************");
		
		list = new Vector<>();
		list.add("Ashish");
		list.add("Yogesh");
		list.add("Mohit");
		list.add("Amit");
		
		for(String i:list)
		{
			System.out.println(i);
		}
		
		
	}

}
