

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportGeneration {
	
ChromeDriver driver;
ExtentSparkReporter reporter;
ExtentTest test;
ExtentReports extent;


@BeforeTest
public void setup()
{
	reporter=new ExtentSparkReporter("./reports/myreport2.html");
	reporter.config().setDocumentTitle("AutomationReport");
	reporter.config().setReportName("Functional test");
	reporter.config().setTheme(Theme.DARK);
	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("hostname","localhost");
	extent.setSystemInfo("os","windows 10");
	extent.setSystemInfo("Tester name","Aswathy murali");
	extent.setSystemInfo("Browser name","Chrome");
	
	driver=new ChromeDriver();
	
	
}
@BeforeMethod
public void loadUrl()
{
	driver.get("https://www.facebook.com");
}


@Test
public void titleVerification()
{
	String expected="facebook";
	String actual=driver.getTitle();
Assert.assertEquals(actual, expected,"Title verified");	
}

@Test
public void buttonTextVerification()
{
	WebElement ele=driver.findElement(By.xpath("//*[@id=\"u_0_5_MZ\"]"));
	String exp="Login";
	String act=ele.getText();
	Assert.assertEquals(act, exp,"Button text verified");
	
}


@AfterMethod
public void browserClose(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL,"Test case failed is "+ result.getName());
		test.log(Status.FAIL,"Test case failed is "+ result.getThrowable());
	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP,"Test case skipped is "+ result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS,"Test case success is "+ result.getName());
	}
}
@AfterTest
public void flush()
{

	extent.flush();
}

}
