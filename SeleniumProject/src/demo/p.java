package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class p {
	
	

	
		public WebDriver driver;

		
		@Parameters({"browser"})
		@Test
		public void testA(String browser)
		{
			if(browser.equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			else
			{
				driver=new FirefoxDriver();
			}
			
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
		}

	}



