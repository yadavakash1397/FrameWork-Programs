package interview;

class Test extends Exception{}
class Main
{
	
	public static void main(String[] args) 
	{
		try 
		{
			
			throw new Test();
		}
		catch(Test t)
		{
			System.out.println("goal got the test");
		}
		finally
		{
			System.out.println("inside finally block");
		}
	}


}