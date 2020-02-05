import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNum
{
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final Scanner input = new Scanner (System.in);

	public static void main (String[] args)
	{
		int i = 1;
		int value = guessNumber();
		int number = 0;

		while (i <= 5)
		{
			System.out.print("Guess a number between 1 and 10: ");
			number = input.nextInt();

			if (number == value)
			{
				System.out.println("Congratulations. You guessed the number!");
				System.out.printf("%nNumber of tries is %d%n", i);
				break;
			}

			if (number != value)
			{
				if (number > value)
				{
					System.out.println("Too high. Try again");
				}
				else if (number < value)
				{
					System.out.println("Too low. Try again");
				}
			}
			if (i == 5 && number != value)
			{
				System.out.printf("%nWrong tries! The number is %d%n", value);
			}
			i++;
		}
	}	

	public static int guessNumber()
	{
		int randNum = 1 + randomNumber.nextInt(10);
		return randNum;
	}
}