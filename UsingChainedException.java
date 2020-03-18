public class UsingChainedException
{
	public static void main(String[] args)
	{
		try
		{
			method1();
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
		}
	}

	// call method2; throw exceptions back to main
	public static void method1() throws Exception
	{
		method2();
	}

	// call method3; throw exceptions back to method1
	public static void method2() throws Exception
	{
		method3();
	}

	// throw Exception back to method2
	public static void method3() throws Exception
	{
		throw new Exception("Exception thrown in method3");
	}
} // end class UsingExceptions