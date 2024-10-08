package webdriverpakage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxWebpage {

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/Software%20Testing/alertbox.html");
	}
	
	@Test
	
		public void sendValues()
		{
		    driver.findElement(By.xpath("//input[@type='button']")).click();
		    Alert ref=driver.switchTo().alert();
		    System.out.println(ref.getText());
		    ref.accept();
		    driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Aswathy");
			driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Murali");
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			
		}
//	@After
//	public void tearDown()
//	{
//		driver.close();
//	}
	
}
