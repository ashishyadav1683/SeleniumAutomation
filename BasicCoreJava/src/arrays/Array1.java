package arrays;

public class Array1 {

	public static void main(String[] args) {
		
		// ashish, rohit, mohit
		
		String[] arr= new String[3];
		
		arr[0]= "Ashish";
		arr[1]= "Rohit";
		arr[2]= "Mohit";
		
		/*System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);*/
		
		//System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
