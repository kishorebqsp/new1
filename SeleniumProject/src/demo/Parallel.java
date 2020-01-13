package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	public WebDriver driver;
	static
	{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	
	
	@Parameters({"browser"})
	@Test
	public void testA(String browser)
	{
		
		
	driver=new ChromeDriver();
		
		
	driver=new FirefoxDriver();
		
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
	}

}
