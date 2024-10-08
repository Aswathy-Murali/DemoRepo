package webdriverpakage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookResponseCodeCheck {
@Test
public void test() throws MalformedURLException, IOException, URISyntaxException
{
	ChromeDriver driver=new ChromeDriver();
	String url="https://www.facebook.com";
	driver.get(url);
	
	List<WebElement> li=driver.findElements(By.tagName("a"));
	for(WebElement el: li)
	{
		String url1=el.getAttribute("href");
		getResponsecode(url1);
	}

}

private void getResponsecode(String url1)  {
try {	
URI obj=new URI(url1);
	
	HttpURLConnection c=(HttpURLConnection)obj.toURL().openConnection();
	if(c.getResponseCode()==200)
	{
		System.out.println("Response code 200 ::// Link : "+url1);
	}
	
	
}catch(Exception e) {
	System.out.println(e.getMessage());
}
}
}
