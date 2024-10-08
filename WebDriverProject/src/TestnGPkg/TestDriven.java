package TestnGPkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDriven {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
	}
	
	@Test
	public void test() throws IOException
	{
	FileInputStream io=new FileInputStream("C:\\Users\\user\\Desktop\\Software Testing\\FaceBookData.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(io);
	XSSFSheet sh=wb.getSheet("Sheet1");
	int row=sh.getLastRowNum();
	System.out.println("number of rows "+row);
	for(int i=1;i<=row;++i) {
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		String password=sh.getRow(i).getCell(1).getStringCellValue();
		driver.get("http://www.facebook.com");
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		String expurl="https://www.facebook.com/";
		String actualurl=driver.getCurrentUrl();
		
		if(expurl.equals(actualurl))
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Login failed");
		}
		
	}
	}
	
}
