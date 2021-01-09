package loops;

public class ForEachLoop2 {

	public static void main(String[] args) {

		String[] data = { "Ashish", "Mohit", "Rohit" };

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

		System.out.println("************");

		for (String var : data) {
			System.out.println(var);
		}

	}

}
