package webdriverpakage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DatafromXML {
	@Parameters ("name")
@Test
public void datafromXML(String a)
{
	System.out.println("value from xml :  "+ a);
}
}
