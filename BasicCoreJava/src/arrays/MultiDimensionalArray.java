package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		String [][] data = new String [3][2];
		
		// Row 1
		data[0][0]= "User1";
		data[0][1]="password1";
		
		//Row2
		data[1][0]= "User2";
		data[1][1]="password2";

		//Row3
		data[2][0]= "User3";
		data[2][1]="password3";
		
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<2; c++)
			{
				System.out.println(data[r][c]);
			}
			
			//System.out.println(data[r][0]);
			//System.out.println(data[r][1]);
		}
	}

}
