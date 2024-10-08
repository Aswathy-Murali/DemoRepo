package webdriverpakage;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RishyHerbal {
	ChromeDriver driver;
	@Before
	public void setUp() {
	driver=new ChromeDriver();
	driver.get("https://rishiherbalindia.linker.store/");
	}
	
//	@Test
//	public void Title()
//	{
//		String title=driver.getTitle();
//		if(title.equals("Rishy Herbal"))
//		{
//			System.out.println(" Title verified");
//		}
//		else
//		{
//			System.out.println(" Title not verified");
//		}
//	}
//	
	@Test
	public void linkCount()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Number of links "+ li.size());
		if(li.size()>100)
		{
			System.out.println("No of links is greater than 100");
		}
		else
		{
			System.out.println("Less than 100");
		}
	}
	
//	@Test
//	public void textCheck()
//	{
//		String page=driver.getPageSource();
//		if(page.contains("Food"))
//			{
//			System.out.println("Food text present");
//			}
//		else
//		{
//			System.out.println("Food text not present");
//		}
//			}
	
	@Test
	public void clickHealth()
	{
		driver.findElement(By.xpath("//div[@class='main-menu desktop-menu']//ul[@class='main-navigation desktop-navigation']//li[2]//a[@class='ls-nav-link']")).click();
	}
	@After
	public void tearDown()
	{
		driver.close();
	}
	

}
