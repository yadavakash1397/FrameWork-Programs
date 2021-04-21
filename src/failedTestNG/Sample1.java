package failedTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 
{
	@Test(groups = "yogesh")
	public void m1()
	{
		Reporter.log("method 1",true);
	}
	
	@Test(groups = "akash")
	public void m2()
	{
		Reporter.log("method 2",true);
	}
	
	@Test(groups = "yogesh")
	public void m3()
	{
		Assert.fail();
		Reporter.log("method3",true);
	}

}
