package webdriverpakage;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpathDemo {

	ChromeDriver driver;
	@Before
	public void setUp()
	{
	driver=new ChromeDriver();	
	}
	@Test
	public void amazon() {
		driver.get("https://www.Amazon.in");  //q1
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));  //q2
	    search.sendKeys("mobiles");
    	search.submit();
    	
    	driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();   //q3
   driver.findElement(By.xpath("//div[@id='nav-xshop']//a[4]")) .click(); 	//q4
    	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();    //q5
    	driver.navigate().back();  //6
    	driver.findElement(By.xpath("//div[@class='nav-left']//a[@id='nav-hamburger-menu']")).click();//7
    	
    	
    	}
//	@After
//	public void tearOff()
//	{
//		driver.close();
//	}
}
