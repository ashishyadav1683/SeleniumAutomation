package webElement;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_Window {
	
	@Test
	public void test1() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr =new ChromeDriver();	
		
		dr.manage().window().maximize();
		
		//Naviget
		dr.get("https://www.naukri.com/");
		
		String parent = dr.getWindowHandle();
		Set<String> windows =dr.getWindowHandles();
		
		System.out.println(parent);
		
		System.out.println("*************************************");
		
		
		
		for(String w:windows)
		{
			//System.out.println(w);
			dr.switchTo().window(w);
			if(!parent.equals(w))
				dr.close();
		}
	}

}
