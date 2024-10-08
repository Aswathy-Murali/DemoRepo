package TestnGPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DragAndDrop {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
	
	}
	
	@Test
	public void draganddrop1()
	{
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement bankacct=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement bankamtsource=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement bankamtdest=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		

		
		WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));		
		WebElement salesaccount=driver.findElement(By.xpath("//*[@id=\"loan\"]"));			
		WebElement salesamtsource=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement salesamtdest=driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
	    Actions act=new Actions(driver);   // Actions class obj creation
	    
	   act.dragAndDrop(bank,bankacct).perform();
	   act.dragAndDrop(bankamtsource,bankamtdest).perform();
	   act.dragAndDrop(sales, salesaccount).perform();
	   act.dragAndDrop(salesamtsource, salesamtdest).perform();
	   
	   WebElement button=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
	   if(button.getText().equals("Perfect!"))
	   {
		   System.out.println("Pefect");
	   }
	}
}
