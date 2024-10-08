package webdriverpakage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void valuePass()
	{
		Select day=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")));
		day.selectByValue("05");
		
		Select month=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
		month.selectByVisibleText("JAN");
		
		Select year=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")));
		year.selectByIndex(04);
		
		}
	
	
	
}
