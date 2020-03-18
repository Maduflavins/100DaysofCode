public class UsingExceptions
{
	public static void main (String[] args)
	{
		try
		{
			throwException();
		}
		catch (Exception exception)
		{
			System.err.println("Exception handled in main");
		}

		doesNotThrowException();
	}

	//demstrate try, catch, finally
	public static void throwException() throws Exception
	{
		try
		{
			System.out.println("Method throwException");
			throw new Exception();
		}
		catch (Exception exception)
		{
			System.err.println("Exception handled in methos throwException");
			throw exception;
		}

		finally // executes regardless of what occurs in try...catch
		{
			System.err.println("Finally executed in throwException");
		}
	}

	// demonstrate finally when no exception occurs
	public static void doesNotThrowException()
	{
		try // try block does not throw an exception
		{
			System.out.println("Method doesNotThrowException");
		}
		catch (Exception exception) // does not execute
		{
			System.err.println(exception);
		}
		finally // executes regardless of what occurs in try...catch
		{
			System.err.println("Finally executed in doesNotThrowException");
		}

		System.out.println("End of method doesNotThrowException");
	}
}