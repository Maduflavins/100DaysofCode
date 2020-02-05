import java.util.Scanner;

public class TimesTable
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a number for its time-table: ");
		int num = input.nextInt();
		
		System.out.println("Number\tProduct");

		for (int i = 1; i <= 12; i++)
		{
			System.out.printf("%d X %d = %d%n", num, i, (num * i));
		}
	}
}