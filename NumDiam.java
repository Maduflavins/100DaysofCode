import java.util.Scanner;

public class NumDiam
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a number to print number triangle: ");
		int n = input.nextInt();

		int space = n;

		for (int c = 1; c <= n; c++)
		{
			for (int i = 1; i <= space; i++)
			{
				System.out.print("*");
			}
			for (int j = 0; j <= (c - 1); j++)
			{
				System.out.print(c - j);
			}
			for (int j = 2; j <= (c); j++)
			{
				System.out.print(j);
			}

			space--;
			System.out.println();

			/*for (int i = 1; i <= 6; i++)
		{
			for (int col = 1; col <= i; col++)
			{
				System.out.print(i - col + 1);
			}
			for(int k =2; k<=i-1; k++){
				System.out.print(k);
			}
			System.out.println();
		}*/
		}
	}
}