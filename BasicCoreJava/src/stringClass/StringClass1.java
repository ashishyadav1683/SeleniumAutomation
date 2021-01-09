package stringClass;

public class StringClass1 {

	public static void main(String[] args) {

		String name ="Your application number is 1234";
		
		//function 1
		System.out.println(name.length());
		
		//function2
		System.out.println(name.charAt(4));
		
		//function3
		String name2 ="ashish";
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(name2));
		
		//function4
		System.out.println(name.replace("A", "1"));
		
		//functin 5
		String []arr = name.split(" ");
		System.out.println(arr[4]);
	}

}
