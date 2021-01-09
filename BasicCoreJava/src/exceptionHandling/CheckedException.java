package exceptionHandling;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(10);
		
		Thread.sleep(3000);
		
		UnCheckedException.sleep();
		
		System.out.println(20);

	}

}
