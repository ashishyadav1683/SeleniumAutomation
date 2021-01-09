package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebElement_DropDown {
	
	@Test
	public void test3() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr =new ChromeDriver();	
		
		dr.manage().window().maximize();
		
		//Naviget
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		dr.findElement(By.cssSelector("a[id='nav_automobile']")).click();
		
		WebElement ele =dr.findElement(By.id("make"));
		
		Select sel = new Select(ele);
		
		sel.selectByIndex(3);
		dr.findElement(By.id("engineperformance")).sendKeys("1245");
		
	}

}
