import java.util.Scanner;

public class NumDiamond
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
				System.out.print(" ");
			}
			for (int j = 1; j <= ((2 * c) - 1); j++)
			{
				System.out.print(c);
			}

			space--;
			System.out.println();
		}
	}
}