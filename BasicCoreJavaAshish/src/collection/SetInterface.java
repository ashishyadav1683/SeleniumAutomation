package collection;

import java.util.*;

public class SetInterface {

	public static void main(String[] args) {

		Set <String> set = new HashSet<>(); // returns unique values
		set.add("Ashish");
		set.add("Manish");
		set.add("Ashish");
		set.add("Diana");
		set.add("Bhim");
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		System.out.println("********************");
		
		
		set = new LinkedHashSet<>();// as inserted it gives back same order with unique
		set.add("Ashish");
		set.add("Manish");
		set.add("Ashish");
		set.add("Diana");
		set.add("Bhim");
		
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		System.out.println("********************");
		
		set = new TreeSet<>(); // default sorted order with unique values
		set.add("Ashish");
		set.add("Manish");
		set.add("Ashish");
		set.add("Diana");
		set.add("Bhim");
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		
		
		

	}

}
