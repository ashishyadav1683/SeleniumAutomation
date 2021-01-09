package arrays;

public class MultiDimentionalArray2 {

	public static void main(String[] args) {

		// 10, 20, 30
		// 40, 50, 60
		// 70, 80, 90

		int[][] data = new int[3][3];

		// Row 1
		data[0][0] = 10;
		data[0][1] = 20;
		data[0][2] = 30;

		// Row2
		data[1][0] = 40;
		data[1][1] = 50;
		data[1][2] = 60;

		// Row3
		data[2][0] = 70;
		data[2][1] = 80;
		data[2][2] = 90;
		
		for (int r=0; r<data.length; r++)
		{
			for(int c=0; c<data[0].length; c++)
			{
				System.out.println(data[r][c]);
			}
		}
	}

}
