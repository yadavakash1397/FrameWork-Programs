package assertion_Examples;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Disadvantages_Soft_assert
{
	@Test
	public void method()
	{
		Reporter.log("hi akash",true);
		Reporter.log("before fail",true);
		SoftAssert soft=new SoftAssert();
		soft.fail();
		Reporter.log("after pass1",true);
		Reporter.log("after pass2",true);
		soft.assertAll();
	}
	
	
}
