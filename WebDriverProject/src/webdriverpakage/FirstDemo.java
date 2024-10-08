package webdriverpakage;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {

	public static void main(String[] args) {
		//browser loading, application loading
		//chromedriver,edgedriver,firefoxdriver
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//driver.close --current tab close
		//driver.quit --entire tab close
		//getTitle
		
		String actualTitle=driver.getTitle();
		String expectedTitle="google";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		String source=driver.getPageSource();
		if(source.contains("html"))
		{
			System.out.println("Contains");
		}
		else
		{
			System.out.println("Not contains");
		}
		driver.close();
		);
	}

}
