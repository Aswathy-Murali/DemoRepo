package webdriverpakage;

import java.util.List;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
	driver=new ChromeDriver();	
	}
	@Test
	public void amazon() {
		driver.get("https://www.Google.in");
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Number of links= "+ li.size());
		for(WebElement el: li)
		{
			System.out.println(el.getText() + el.getAttribute("href"));
		}
	
    
}
	@After
	public void tearDown()
	{
		driver.close();
	}
}