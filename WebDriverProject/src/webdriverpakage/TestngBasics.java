package webdriverpakage;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics {
@BeforeTest
public void setUp()
{
	System.out.println("Execute first before all test");
}

@BeforeMethod
public void beforeMethod()
{
	System.out.println("Before method");
}
@Test(priority = 5,groups= {"sanity"},invocationCount=3)
public void test1()
{
	System.out.println("Test 1");
}
@Test(priority = 4,groups= {"sanity"})
public void test2()
{
	System.out.println("Test 2");
}
@Test(priority = 3,groups= {"sanity"})
public void test3()
{
	System.out.println("Test 3");
}
@Test(priority = 2,enabled=false,groups= {"smoke"})
public void test4()
{
	System.out.println("Test 4");
}
@Test(priority = 1,groups= {"smoke","regression"})
public void test5()
{
	System.out.println("Test 5");
}
@AfterMethod
public void afterMethod()
{
	System.out.println("Execute after each test");
	System.out.println("-------------------------------");
}
@AfterTest
public void afterTest()
{
	System.out.println("Execute last");
}
}
