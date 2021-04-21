package failedTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 
{
	@Test(groups = "ranjit")
	public void m6()
	{
		Assert.fail();
		Reporter.log("method 6",true);
	}
	
	@Test(groups = "yogesh")
	public void m7()
	{
		Reporter.log("method 7",true);
	}

}
