

package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.CreatePage;
import pagepkg.Fbliginpage;

public class FbTestPage {
	WebDriver driver=new ChromeDriver();

@BeforeTest
public void set()
{
	
	driver.get("https://www.facebook.com");
}
@Test
public void login() throws InterruptedException
{
	Fbliginpage obj=new Fbliginpage(driver);


	obj.setValues("abc@gmail.com","sdhsd");
	obj.loginclick();
	driver.wait();
	driver.navigate().back();
	CreatePage obj1=new CreatePage(driver);
	obj1.clickCreatePage();
	obj1.checkText();
	obj1.signup();
	
}
}