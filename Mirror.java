public class Mirror
{
	public static void main (String[] args)
	{		
		for (int i = 1; i <= 6; i++)
		{
			for (int a = 6; a >= i; a--)
			{
				System.out.print(" ");
			}
			for (int j = 0; j <= i - 1; j++)
			{
				System.out.print(i - j);
			}

			for(int k =2; k<=i; k++){
				System.out.print(k);
			}
			System.out.println();
		}
	}
}