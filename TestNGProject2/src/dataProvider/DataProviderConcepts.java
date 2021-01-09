package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcepts {
	
	@Test(dataProvider="getData")
	public void login(String userName, String password)
	{
		System.out.println("Enter Username :" +userName);
		System.out.println("Enter Password :" +password);
		System.out.println("Click login");
	}
	
	@DataProvider
	public String [][] getData() {
		
		/*
		 * user1, password1 
		 * user2, password2 
		 * user3, password3
		 */
		
		String [][] data = new String[3][2];
		
		//Row1
		data[0][0]="user1";
		data[0][1]= "password1";
		
		//Row2
		data[1][0]="user2";
		data[1][1]= "password2";
				
		//Row3
		data[2][0]="user3";
		data[2][1]= "password3";
		
		return data;
	}

}
