package TestnGPkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EventsTask {
	String uri="https://demo.guru99.com/test/simple_context_menu.html";
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(uri);
		
	}
	@Test
	public void clickAlert()
	{
			WebElement one=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));		    
		    Actions act=new Actions(driver);   // Actions class obj creation
		    
		    act.contextClick(one).perform();   //Right click action
		    
		    WebElement one_sub=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));	
		    act.click(one_sub).perform();   //Click action
		   // one.click();
		    Alert ref=driver.switchTo().alert();  //Alert box handling
		    	System.out.println(ref.getText());
		    	ref.accept();
		    
		    WebElement second=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));   
		    act.doubleClick(second).perform();		 //Double click action
		    	Alert ref1=driver.switchTo().alert();   //Alert box handling
		    	System.out.println(ref1.getText());
		    	ref1.accept();
		
	}

}
