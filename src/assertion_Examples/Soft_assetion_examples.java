package assertion_Examples;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assetion_examples
{
	SoftAssert soft;
	@Test
	void Equalsmethod()
	{
		soft=new SoftAssert();
		soft.assertEquals("hi", "hi");	
	}
	
	@Test
	void notequalsmethod()
	{
		soft.assertNotEquals("hi", "hello");
	}
	
	@Test
	void truemethod()
	{
		soft.assertTrue(true);
	}
	
	@Test
	void falsemethod()
	{
		soft.assertFalse(false);
	}
	
	@Test
	void nullmethod()
	{
		soft.assertNull(null);
	}
	
	@Test
	void notnullmethod()
	{
		soft.assertNotNull("");
	}
	
	@Test
	void failmethod()
	{
		soft.fail();
		soft.assertAll();
	}
	
	
	
	
	
	
	

}
