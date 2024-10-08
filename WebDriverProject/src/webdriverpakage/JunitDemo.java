package webdriverpakage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo {
	ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");

	}
	@Test
	public void titleVerifiction()
	{
		String at=driver.getTitle();
		if(at.equals("Google"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	@Test
	public void textVerification()
	{
		String ps=driver.getPageSource();
		if(ps.contains("html"))
		{
			System.out.println("Text present");
		}
		else
		{
			System.out.println("Not present");
		}
	}
	
	@After
	public void tearDown()
	{
		//driver.close();
	}
}
