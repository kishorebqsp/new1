package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("./excel/data.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		String s = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(s);
String username = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
driver.findElement(By.id("username")).sendKeys(username);
String pwd = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
driver.findElement(By.name("pwd")).sendKeys(pwd);
	}

}
