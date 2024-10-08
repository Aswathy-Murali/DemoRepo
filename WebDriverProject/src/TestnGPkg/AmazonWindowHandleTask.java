package TestnGPkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AmazonWindowHandleTask {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	String url="https://amazon.in";	
	driver=new ChromeDriver();
	driver.get(url);

	}
	@SuppressWarnings("deprecation")
	@Test
	public void windowHandle()
	{
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		ele.sendKeys("mobile phones");
		ele.submit();
		String parentWindow=driver.getWindowHandle();
driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img\r\n"
				+ "")).click();
		
		
		String exp="Amazon.in : mobile phones";
		String act=driver.getTitle();
		
		Assert.assertEquals(act, exp);       
		
	
	
	Set<String> secondwindows=driver.getWindowHandles();
	for(String windows:secondwindows)
	{
		if(!windows.equalsIgnoreCase(parentWindow))
		{
			driver.switchTo().window(windows);
			break;
			
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
//		WebElement ele2=driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		
		
//		ele2.click();
		
		
		
			
		}
		//driver.switchTo().window(parent);
	}
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	
	
	}
}
