//6.26 (Reversing Digits) Write a method that takes an integer value and returns the number with
//its digits reversed. For example, given the number 7631, the method should return 1367. Incorporate
//the method into an application that reads a value from the user and displays the result.


import java.util.Scanner;

public class NumberReverse
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter any number to reverse: ");
		int number = input.nextInt();
		
		reverse(number);

		
	}

	public static void reverse(int num)
	{
		int remainder = 0;
		while (num > 0)
		{
			remainder = num % 10;
			System.out.print(remainder);
			num = num / 10;
		}
		if (num == 0)
		{
			System.out.println();
		}
		System.out.println();
	}
}