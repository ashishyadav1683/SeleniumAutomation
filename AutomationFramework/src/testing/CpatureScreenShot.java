package testing;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import configuration.Configuration;
import functionLibrary.ApplicationLibrary;

public class CpatureScreenShot {

	public static void main(String[] args) throws IOException {

		ApplicationLibrary lib = new ApplicationLibrary();

		WebDriver dr = lib.launchBrowser("Chrome");

		dr.get(Configuration.url);

		// dr.findElement(By.id("abc123")).click();

		List<WebElement> list = dr.findElements(By.id("abc123"));

		if (list.size() > 0) {
			System.out.println("Element is present");
		} else {
			System.out.println("Element is not present");
			
			lib.captureScreenShot(dr, "Homepage");

			/*
			 * TakesScreenshot screenshot = (TakesScreenshot) dr; File src =
			 * screenshot.getScreenshotAs(OutputType.FILE); String name = new
			 * SimpleDateFormat("yyyy.mm.dd.HH.mm.ss").format(new Date());
			 * FileHandler.copy(src, new
			 * File("E:\\AutomationCodeBase\\AutomationFramework\\login" + name + ".jpg"));
			 */
		}
	}

}
