package Traning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest1 {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test 
	public void validLogin() {
		
		driver.navigate().to("http://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("supersecretpassword");
		WebElement btn = driver.findElement(By.tagName("button"));
		
	}
		@AfterTest
		
		public void teardown() {
			driver.close();
		

}
}