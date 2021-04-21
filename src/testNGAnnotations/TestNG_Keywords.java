package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Keywords 
{
	@BeforeClass
	public void beforeclasss()
	{
		Reporter.log("open browser and enter url",true);
	}
	
	@BeforeMethod
	public void beforemthd()
	{
		Reporter.log("login",true);
	}
	
	@Test(priority = -5)
	public void m1()
	{
		Reporter.log("verify name",true);
	}
	
	@Test(priority = -1,enabled = false)
	public void m2()
	{
		Reporter.log("verify id",true);
	}
	
	@Test(invocationCount = 10)
	public void m3()
	{
		Reporter.log("verify lastname",true);
	}
	
	@AfterMethod
	public void aftmethd()
	{
		Reporter.log("logout",true);
	}
	
	@AfterClass
	public void aftclass()
	{
		Reporter.log("close browser",true);
	}
	
	
	
	
	
	
	
	
}
