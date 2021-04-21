package assertion_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_assert_examples 
{
	//1
	@Test
	public void equalsMethod()
	{
		Assert.assertEquals("hi", "hi");
	}

	//2
	@Test
	public void notequalsmethod()
	{
		Assert.assertNotEquals("hi", "hello");
	}
	
	//3
	@Test
	public void nullmethod()
	{
		Assert.assertNull(null);
	}
	
	//4
	@Test
	public void notnullmethod()
	{
		Assert.assertNotNull("");
	}
	
	//5
	@Test
	public void truemethod()
	{
		Assert.assertTrue(true);
	}
	
	//6
	@Test
	public void falasemethod()
	{
		Assert.assertFalse(false);
	}
	
	//7
	@Test
	public void failmethod()
	{
		Assert.fail();
	}
			
}
