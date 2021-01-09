package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebElement_Calender {
	
	@Test
	public void calendar() {
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
		
		dr.findElement(By.id("opendateofmanufacturecalender")).click();
		
		//26 12 1999
		
		String expYear ="1999";
		String expMonth ="June";
		String day = "26";
		
		String actYear=dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println(actYear);
		
		while(!expYear.equals(actYear))
		{
			dr.findElement(By.xpath("//a[@title='Prev']")).click();
			actYear=dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
		
		String actMonth=dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		while(!expMonth.equals(actMonth))
		{
			dr.findElement(By.xpath("//a[@title='Prev']")).click();
			actMonth=dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}
		
		dr.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='"+day+"']")).click();
		
		
	}
	
}
