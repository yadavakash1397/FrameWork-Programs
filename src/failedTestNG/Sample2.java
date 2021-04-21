package failedTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 
{
	@Test(groups = "yogesh")
	public void m4()
	{
		Reporter.log("method 4",true);
	}
	
	@Test(groups = "akash")
	public void m5()
	{
		Reporter.log("method 5",true);
	}
	
	
}
