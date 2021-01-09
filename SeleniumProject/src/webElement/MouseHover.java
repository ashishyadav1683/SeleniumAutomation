package webElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHover {

	
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr =new ChromeDriver();	
		
		dr.manage().window().maximize();
		
		//Implicit wait and Explicit wait
		/*
		 * Implicit wait will wait for your elements presence on web page and it will
		 * poll dom in every 500 ms so suppose we have given 10 seconds wait in
		 * "dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);" then it will
		 * poll dom 20 times max and if element is visible in 1000 ms then it will not
		 * wait for rest of the 9 seconds 9:06 AM it will jump to next step
		 */
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Naviget
		dr.get("https://www.flipkart.com/");
		
		dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions act =new Actions(dr);
		
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Women']"))).build().perform();
		
		//Thread.sleep(2000);
		dr.findElement(By.xpath("//a[text()='Flats']")).click();
		
		
		//Explicit wait
		WebDriverWait wait= new WebDriverWait(dr,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='HQL4QS _28DFQy']/div[@class='_3FdLqY']")));
		
		act.dragAndDropBy(dr.findElement(By.xpath("//div[@class='HQL4QS _28DFQy']/div[@class='_3FdLqY']")),100,0).build().perform();
		
	}
}
