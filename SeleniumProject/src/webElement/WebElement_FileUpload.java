package webElement;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebElement_FileUpload {
	
	@Test
	public void fileUpload() throws AWTException, InterruptedException
	{
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
		
		//next button
		dr.findElement(By.id("nextenterinsurantdata")).click();
		
		//file upload
		dr.findElement(By.id("open")).click();
		
		//keyboard and mouse related operations
		Robot rb = new Robot();
		
		StringSelection cb = new StringSelection("C:\\Users\\owner\\Desktop\\ShowLe");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb, null);
		
		Thread.sleep(10000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.delay(20000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
