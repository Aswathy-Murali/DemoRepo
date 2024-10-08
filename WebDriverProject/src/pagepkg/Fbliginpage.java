package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbliginpage {
	WebDriver driver;
	
	
	//page factory
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbepass;
	
	@FindBy(name="login")
	WebElement fblogin;
	
	public Fbliginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void setValues(String email, String pwd) {
		
		fbemail.sendKeys(email);
		fbepass.sendKeys(pwd);
		
	}

	public void loginclick() {
		
		fblogin.click();
	}
	
	public void checkUrl()
	{
		String expurl="https://www.facebook.com/";
		String actualurl=driver.getCurrentUrl();
		
		if(expurl.equals(actualurl))
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Login failed");
		}
	}

}
