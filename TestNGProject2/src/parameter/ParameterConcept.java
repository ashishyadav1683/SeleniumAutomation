package parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterConcept {
	
	@Test(priority =0)
	@Parameters({"browser"})
	public void launchBrowser(String browserName) {
		System.out.println("Lauch  Browser:"+browserName);
		
	}

	@Test(priority =1, dependsOnMethods = {"launchBrowser"})
	public void login() {
		System.out.println("Login Test");
	}
	
	@Test(priority =2,dependsOnMethods = {"login"})
	public void verifyInbox() {
		System.out.println("Veify Inbox");
	}
	
	@Test(priority =3,dependsOnMethods = {"login"})
	public void logout() {
		System.out.println("Logout test");
	}
}
