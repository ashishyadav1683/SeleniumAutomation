package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		try {
			// Verify Launch browser
			System.out.println(10 / 0);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// Close all the db connections
			System.out.println("Close all the db connections");
		}
	}

}
