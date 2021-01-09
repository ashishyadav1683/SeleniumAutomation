package conditionalStatement;

public class NestedIfStatement {

	public static void main(String[] args) {


		//Test case 1	
		//Launch browser - failed
		//Navigate -
		//Verify Google logo -
				
		boolean step1=false;
		boolean step2= false;
		boolean step3= false;


if(step1)
{
	System.out.println("Step 1 is passed");
	
	if(step2)
	{
		System.out.println("Step 2 is passed");
		
		if(step3)
		{
			System.out.println("Step 3 is passed");
		}else {
			System.out.println("Step 3 is failed");
		}
		
	}else {
		System.out.println("Step 2 is failed");
	}
	
}else {
	System.out.println("Step 1 is failed");
}


	}

}
