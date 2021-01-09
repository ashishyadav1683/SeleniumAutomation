package collection;

import java.util.*;


public class SetInterface {

	public static void main(String[] args) {

		Set<String> set =new HashSet<>();
		
		set.add("Rozina");
		set.add("Rozina");
		set.add("Rohit");
		set.add("Ashish");
		set.add("Priya");
		set.add("Karishma");
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		System.out.println("************************");
		
		set =new LinkedHashSet<>();// giving same order as inserted
		
		set.add("Rozina");
		set.add("Rozina");
		set.add("Rohit");
		set.add("Ashish");
		set.add("Priya");
		set.add("Karishma");
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		System.out.println("************************");
		
		set =new TreeSet<>();// use for sorting
		
		set.add("Rozina");
		set.add("Rozina");
		set.add("Rohit");
		set.add("Ashish");
		set.add("Priya");
		set.add("Karishma");
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		System.out.println("************************");
		
	}

}
