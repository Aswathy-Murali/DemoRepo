package TestnGPkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReddiffDropDown {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void displayContry()
	{

		
		Select country=new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
		
		List<WebElement> list=country.getOptions();	
		for(WebElement we:list)
		{
			System.out.println(we.getText());
		}
		
	}
}
