public class OpenPrint
{
	public static void main (String[] args)
	{
		int myValue = 1;
		int myNewValue = 1;

		for (int i = 0; i <= 9; i++)
		{
			myValue = (int) Math.pow(10, i);
			System.out.printf("%d %n", myValue);

			for (int j = 1; j <= 9; j++)
			{
				myNewValue = (int) Math.pow(10, j);
				System.out.printf("%d %n", myNewValue);
			}
			
			/*myValue = (int) (myValue + Math.pow(10, i));
			//myValue = myValue * myValue;
			System.out.printf("%d %d %n", myValue, myValue);*/
		}
	}
}