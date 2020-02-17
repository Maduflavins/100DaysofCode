public class OpenProduct
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 9; i++)
		{
			String value = "";
			for (int j = 1; j <= i; j++)
			{
				value += j;
			}
			int newValue= Integer.parseInt(value);
			System.out.print(newValue + " x 9 + " + i + " = " + (newValue * 9 + (i + 1)));
			System.out.println();
		}
	}
}