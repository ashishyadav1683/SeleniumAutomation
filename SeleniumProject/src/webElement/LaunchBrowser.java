package webElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr =new ChromeDriver();	
		
		dr.manage().window().maximize();
		
		//Naviget
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		//System.out.println(dr.getTitle());
		
		//Close
		//dr.close();
		dr.quit();
		System.out.println(dr.getTitle());
	
	}

}
