package TestnGPkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99WindowHandling {
ChromeDriver driver;
@BeforeTest
public void setup()
{
String url="http://demo.guru99.com/popup.php";	
driver=new ChromeDriver();
driver.get(url);

}
@Test
public void windowHandle()
{
	String parent=driver.getWindowHandle();
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("/html/body/p/a")).click();
	
	Set<String> allwindows=driver.getWindowHandles();
	for(String windows:allwindows)
	{
		if(!windows.equalsIgnoreCase(parent))
		{
			driver.switchTo().window(windows);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("sdasfadf@gmail.com");
			//driver.close();
		}
		//driver.switchTo().window(parent);
	}
	}
}
