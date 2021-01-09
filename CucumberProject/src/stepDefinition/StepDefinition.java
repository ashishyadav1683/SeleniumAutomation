package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	
	WebDriver dr;

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
			System.out.println("Login page is displayed");
			System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
			dr = new ChromeDriver();
			dr.manage().window().maximize();
			
			//Navigate
			dr.get("https://www.flipkart.com/");
			
	}
	
	
	@When("^User enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		
		dr.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("dzwork19@hotmail.com");
		dr.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("temp@password");
		dr.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	}
	
	@When("^I enter valid (.*) and (.*) on login page$")
	public void enter_multiple_values(String username, String password) throws Throwable {
		  dr.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(username);
		  dr.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(password);
		  dr.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	}

	@Then("^Homepage should be displayed$")
	public void homepage_should_be_displayed() throws Throwable {
		Assert.assertTrue(dr.getTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
	}
	
}
