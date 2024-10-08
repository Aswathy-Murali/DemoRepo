package TestnGPkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadRobotClass {
	ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/word_to_pdf");
}
@Test
public void sendpath() throws AWTException
{
	
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	fileupload("C:\\Users\\user\\Desktop\\Software Testing\\JAVA.docx");
}
public void fileupload(String str) throws AWTException
{
	StringSelection str1=new StringSelection(str);   //java code
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null); // java code to copy path (str1) to clipboard
	
	Robot rob=new Robot();
	rob.delay(3000);
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_V);
	rob.keyRelease(KeyEvent.VK_CONTROL);
	rob.keyRelease(KeyEvent.VK_V);
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
	
}

}
