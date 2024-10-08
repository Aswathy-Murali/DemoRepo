package TestnGPkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	ChromeDriver driver;
@BeforeTest
public void set()
{
String url="https://www.trivago.in/en-IN?themeId=280&sem_keyword=trivago&sem_creativeid=598703244843&sem_matchtype=e&sem_network=g&sem_device=c&sem_placement=&sem_target=&sem_adposition=&sem_param1=&sem_param2=&sem_campaignid=12417296108&sem_adgroupid=125063060544&sem_targetid=kwd-5593367084&sem_location=1007776&cipc=br&cip=9119000005&gad_source=1&gclid=Cj0KCQjwgL-3BhDnARIsAL6KZ6_8m7FvOwI7PiJcfY9sRjiNE6TUZ_9CC6rFuuMAsBp9vtG1MbZeyBcaArViEALw_wcB"	;
driver=new ChromeDriver();
driver.get(url);
}
@Test
public void datepick()
{
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[1]/fieldset/button[1]/span")).click();
	datepicker("November 2024","20");

	
	
}
public void datepicker(String exmonth,String exdate)
{
	while(true)
	{
		WebElement monthdetals=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
	
		String month=monthdetals.getText();
		if(exmonth.equals(month)) {
		 System.out.println(month);
		 break;
	 }
	 else
	 {
				 driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
	 }
	}
	
	List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
    for(WebElement we:elements)
    {
    	String day=we.getText();
    	if(day.equals(exdate))
    	{
    		we.click();
    		System.out.println(day);
    	break;
    	}
    }
}
}
