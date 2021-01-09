package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElement_Link {
	
	@Test
	public void test1()
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr =new ChromeDriver();	
		
		dr.manage().window().maximize();
		
		//Naviget
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		WebElement link =dr.findElement(By.partialLinkText("Automobil"));
		//WebElement link =dr.findElement(By.name("Navigation Automobile"));
		//WebElement link =dr.findElement(By.linkText("Automobile"));
		//WebElement link =dr.findElement(By.id("Nav_automobile"));
		//WebElement link =dr.findElement(By.xpath("//a[@id='nav_automobile']"));
		//WebElement link =dr.findElement(By.cssSelector("a[id='nav_automobile']"));
		
		Assert.assertEquals(link.getText(), "Automobil");
		System.out.println(link.getText());
		link.click();
	}

}
