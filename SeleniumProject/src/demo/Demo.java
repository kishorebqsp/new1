package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo {

	@DataProvider
	public Object[][] getdata()
	{
		Object[][] a=new Object[3][2];
		a[0][0]="userA";
		a[0][1]=1234;
		a[1][0]="userB";
		a[1][1]=4567;
		a[2][0]="admin";
		a[2][1]="manager";
		return a;
	}
	@Test(dataProvider="getdata")
	public void createuser(String username,String pwd)
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
	

	}

}
