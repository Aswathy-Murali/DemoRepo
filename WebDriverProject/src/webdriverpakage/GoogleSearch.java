package webdriverpakage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void GoogleSer()
	{
		//driver.findElement(By.name("q")).sendKeys("Testing",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		
//or
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Books");
		search.submit();
	}
	
}

//q
//btnK