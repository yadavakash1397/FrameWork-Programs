package assertion_Examples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disadvantages_of_hard_assert 
{
	@Test
	public void method()
	{
		Reporter.log("hi akash",true);
		Reporter.log("before fail",true);
		Assert.fail();
		Reporter.log("after fail1",true);
		Reporter.log("after fail2");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	   
	
}
