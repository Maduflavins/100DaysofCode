import java.util.Scanner;

public class DoWhileExercise
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		int x;

		do{
			System.out.print("Enter first number: ");
			int a = input.nextInt();

			System.out.print("Enter second number: ");
			int b = input.nextInt();

			System.out.println("Sum is " + (a + b));

			System.out.println("\nWould you like to continue.\nPress 1.\nOtherwise press 2:  ");
			x = input.nextInt();
		}while (x != 2);
	}
}