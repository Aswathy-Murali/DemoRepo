

package webdriverpakage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
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

	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("aswathymurali20@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("faceaswathy");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	
}


}
