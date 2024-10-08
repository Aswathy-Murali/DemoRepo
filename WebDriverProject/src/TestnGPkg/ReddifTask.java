package TestnGPkg;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReddifTask {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void testLogo()
	{
		
		WebElement ele=driver.findElement(By.xpath("//img[@title=\"Rediff.com\"]"));
		if(ele.isDisplayed())
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not present");
		}
	}
	@Test
	public void checktext()
	{
		WebElement text=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
	
	System.out.println("Button name "+ text.getAttribute("value"));
	}
	@Test
	public void radioButton()
	{
	
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
	if(ele.isSelected())
	{
		System.out.println("selected");
		
	}
	else
		System.out.println("not selected");
		
	}
	@Test
	public void buttonEnabled()
	{
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		if(ele.isEnabled())
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("not enabled");
		}
	}
	@After
	public void tearDown()
	{
		driver.close();
	}

}
