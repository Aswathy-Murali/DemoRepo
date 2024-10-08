package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage {
	WebDriver driver;
	
	
	
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement create;
	
	@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
	WebElement signup;
	
	public CreatePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void clickCreatePage() {
		create.click();
		
	}
	public void signup() {
		signup.click();
		}
	public void checkText() {
		String s=driver.getPageSource();
		if(s.contains("Create a page"))
		{
			System.out.println("contains");
		}
		
	}
	
	
	
}
