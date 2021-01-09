package functions;

public class Functions3 {

	public static void main(String[] args) {
		
		//IIT JEE >=40, CET>=60
		// you are eligible
		// you are not eligible
		
		
	boolean k =eligibility(39,60);
	if (k)
	{
		System.out.println("You are eligible");
	}else
	{
		System.out.println("You are not eligible");
	}
	
	int a=sum(40,30);
	System.out.println(a);

	}
	
	public static boolean eligibility(int a, int b)
	{
		if(a>=40 && b>=60)
		{
			return true;
		}else
		{
			return false;	
		}
	}
	
	public static int sum(int a, int b)
	{
		return a+b;
	}

}
