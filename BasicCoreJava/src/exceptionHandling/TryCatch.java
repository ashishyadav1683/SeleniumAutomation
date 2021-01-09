package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		
		try {

		int a =10;
		int b= 0;
		System.out.println(a/b);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of the test case");	

	}

}
