package Traning;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		String strlbl=driver.findElement(By.cssSelector("label > span")).getText();
		System.out.println("Lable in main Page ......"+strlbl);
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		System.out.println("hello");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//driver.findElement(By.xpath("/html/body/input")).sendKeys("Welcome");
		driver.findElement(By.tagName("input")).sendKeys("ABCD");
	}

//	public IframeTest() {
//		// TODO Auto-generated constructor stub
//	}

}
