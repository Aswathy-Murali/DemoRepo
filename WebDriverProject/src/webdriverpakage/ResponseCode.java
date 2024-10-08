package webdriverpakage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class ResponseCode {
@Test
public void Response() throws URISyntaxException, MalformedURLException, IOException
{
	String url="https://www.facebook.com";
	URI obj=new URI(url);
	
	HttpURLConnection c=(HttpURLConnection)obj.toURL().openConnection();
	System.out.println(c.getResponseCode());
	}
}
