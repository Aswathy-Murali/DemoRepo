package webdriverpakage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
}
@Test
public void Login()
{
	driver.findElement(By.id("email")).sendKeys("aswathymurali20@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("aaaaaaaaaaa");
	driver.findElement(By.name("login")).click();
	System.out.println("After login");
}


}
