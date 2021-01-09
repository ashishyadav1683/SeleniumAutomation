package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_Iframe {
	
	@Test
	public void test1() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr =new ChromeDriver();	
		
		dr.manage().window().maximize();
		
		//Naviget
		dr.get("https://www.demoqa.com/frames");
		
		dr.switchTo().frame(0);
		System.out.println(dr.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
		

}
}