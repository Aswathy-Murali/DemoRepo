package TestnGPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLoginTest {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void test()
	{
	
			
			driver.findElement(By.name("email")).sendKeys("aswathymurali20@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("faceaswathy");
		driver.findElement(By.name("login")).click();
		
		String expurl="https://www.facebook.com/";
		String actualurl=driver.getCurrentUrl();
		if(expurl.equals(actualurl))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
