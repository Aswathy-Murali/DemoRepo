package TestnGPkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadAutoit {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void upload() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\Software Testing\\T1.exe");
		Thread.sleep(3000);
}
}