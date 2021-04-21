package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_On_Methods_Keyword
{
	@Test(timeOut = 1000)
	void M1() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("login",true);
	}
	
	@Test
	void m2()
	{
		Reporter.log("login2",true);
	}
	
	@Test(dependsOnMethods = {"m2"})
	void m3()
	{
		Reporter.log("login",true);
	}
}
