public class OpenProductI
{
	public static void main(String[] args)
	{
		for(int i = 9; i > 1; i--)
		{
			String value = "";
			for (int j = 9; j >= i; j--)
			{
				value += j;
				//System.out.print(j);
			}
			int newValue= Integer.parseInt(value);
			//System.out.print(newValue + " x 9 + " + (i + 1) + " = " + (newValue * 9 + (i + 1)));
			System.out.print(newValue + " x 9 + " + (i - 2) + " = " + (newValue * 9 + (i - 2)));
			System.out.println();
		}
	}
}