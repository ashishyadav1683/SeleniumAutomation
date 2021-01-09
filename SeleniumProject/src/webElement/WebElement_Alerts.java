package webElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_Alerts {

	@Test
	public void test1() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr =new ChromeDriver();	
		
		dr.manage().window().maximize();
		
		//Naviget
		dr.get("https://www.demoqa.com/alerts");
		dr.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alt =dr.switchTo().alert();
		System.out.println(alt.getText());
		//alt.accept();
		alt.dismiss();
}
}