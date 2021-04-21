package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations55 
{
	@BeforeClass
	public void beforeclass1()
	{
		Reporter.log("precondition for login... open browser and enter url",true);
	}
	
	@BeforeMethod
	public void beforetest1()
	{
		Reporter.log("login to kite",true);
	}
	
	@Test
	public void test1()
	{
		Reporter.log("verify name",true);
	}
	
	@Test
	public void test2()
	{
		Reporter.log("verify id",true);
	}
	
	@AfterMethod
	public void aftertest1()
	{
		Reporter.log("logout",true);
	}
	
	@AfterClass
	public void afterclass1()
	{
		Reporter.log("close browser", true);
	}
}
