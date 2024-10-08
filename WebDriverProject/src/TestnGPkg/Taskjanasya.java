package TestnGPkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Taskjanasya {
	ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://janasya.com/");	
	
}
@Test
public void task() throws IOException
{
	//Click new-> Saga Mouse over	
	
	WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement we1=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/nav[1]/ul/li[1]/details/summary"));
	Actions act=new Actions(driver);
	act.moveToElement(we1).perform();
	WebElement we2=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/nav[1]/ul/li[1]/details/div/ul/li[1]/ul/li[3]/a"));
	act.click(we2).perform();
	
	//Count total no of links
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("Total number of links  "+li.size());
	if(li.size()>=400)
	{
		System.out.println("Number of links is 400");
	}
	else
	{
		System.out.println("Links less than 400");
	}

	
	//title verification

if(driver.getTitle().equals("janasya"))
{
	System.out.println("Title verified");
}
else
{
	System.out.println("Title not verified");
	
}
	


//Screenshot of page


File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(src,new File("C://Users//user//Desktop//Software Testing//screenshot//janasya.png"));
}
}
