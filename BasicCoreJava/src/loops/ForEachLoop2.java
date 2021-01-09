package loops;

public class ForEachLoop2 {

	public static void main(String[] args) {

		// String , Ashish , Rohit , Mohit
		String[] arr = { "Ashish", "Rohit", "Mohit" };

		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("*******************************");

		for (String var : arr)// for each loop or enhanced for loop
		{
			System.out.println(var);
		}

	}

}
