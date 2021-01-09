package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {

		//Ashish -Array
		//Anand, Ashish, Rohit - String Array
		
		// ArrayList : Default size is 10 , once we reached maximum size, it will expand by 50%.
		// Javatpoint : table of difference btween arraylist and linkedlist
		
		
		List <String> list = new ArrayList<>();
		
		list.add("Ashish");
		list.add("Mohit");
		list.add("Rozina");
		list.add("Rozina");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
		System.out.println("********************");
		
		list = new LinkedList<>();
		
		list.add("Ashish");
		list.add("Mohit");
		list.add("Rozina");
		list.add("Rozina");
		
		
		for(String s:list)
		{
			System.out.println(s);
		}

		System.out.println("******************");
		list = new Vector<>();
		
		list.add("Ashish");
		list.add("Mohit");
		list.add("Rozina");
		list.add("Rozina");
		
		for(String s:list)
		{
			System.out.println(s);
		}
	}

}
