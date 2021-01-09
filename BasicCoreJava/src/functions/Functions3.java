package functions;

public class Functions3 {

	public static void main(String[] args) {

		//
		boolean ret = eligibility(30, 60);
		if (ret)
		{
			System.out.println("You are eligible");
		}else
		{
			System.out.println("You are not eligible");
		}
		int a = sum(10, 20);
		System.out.println(a);
		
		int b = sum(30,40);
		System.out.println(b);
		
		int c = sum(a,b);
		System.out.println(c);
		
	}

	public static boolean eligibility(int iit, int cet) {
		if (iit >= 40 || cet >= 60) {
			return true;
		} else {
			return false;
		}
	}

	public static int sum(int a, int b) {
		return a+b;
	}

}
