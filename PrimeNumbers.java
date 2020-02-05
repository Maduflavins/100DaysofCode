import java.util.Scanner;
//import java.math.BigDecimal;
import java.security.SecureRandom;

public class PrimeNumbers
{
	public static void main (String[] args)
	{
		SecureRandom randomNum = new SecureRandom();
		int y = 2 + randomNum.nextInt(9);
		
		Scanner input = new Scanner (System.in);
		

		//System.out.println("Prime numbers between 1 and 1000 are: ");
		System.out.println("Prime numbers between 1 and 1000 are: ");
		
		long num = input.nextInt();
		//BigDecimal num = new BigDecimal(value);

		//for (int num = 1; num <= 1000; num++){

		//if (num / 1 == num && num / num == 1)
		if (num > 0)
		{
			if (num == 1 || num >= 4 && (num % 2 == 0 || num % 3 == 0))
			{
				System.out.printf("%d is not prime%n", num);
			}
			else if (num > 5 && num % 5 == 0)
			{
				System.out.printf("%d is not prime%n", num);
			}
			else if (num > 7 && num % 7 == 0)
			{
				System.out.printf("%d is not prime%n", num);
			}
			else if ((num >= 11 || num >= 99) && num % Math.sqrt(num) == 0)
			{
				System.out.printf("%d is not prime%n", num);
			}
			else if ((num >= 11 && num % Math.cbrt(num) == 0))
			{
				System.out.printf("%d is not prime%n", num);
			}
			else if (num >= 11 && (num % (Math.pow(num, (1/4))) == 0))
			{
				System.out.printf("%d is not prime%n", num);
			}
			else if (num >= 11 && (num % (Math.pow(num, (1/5))) == 0))
			{
				System.out.printf("%d is not prime%n", num);
			}
			else if (num >= 11 && (num % (Math.pow(num, (1/6))) == 0))
			{
				System.out.printf("%d is not prime%n", num);
			}
			else if (num >= 11 && (num % (Math.pow(num, (1/7))) == 0))
			{
				System.out.printf("%d is not prime%n", num);
			}
			else if (num >= 11 && (num % (Math.pow(num, (1/8))) == 0))
			{
				System.out.printf("%d is not prime%n", num);
			}
			else if (num >= 11 && (num % (Math.pow(num, (1/9))) == 0))
			{
				System.out.printf("%d is not prime%n", num);
			}
			else if (num >= 11 && (num % (Math.pow(num, (1/10))) == 0))
			{
				System.out.printf("%d is not prime%n", num);
			}
			else
			{
				System.out.printf("%d is prime%n", num);
				//System.outf.println(num);
			}
		}
		else if (num <= 0 )
		{
			System.out.println("Error. Number is not a positive integer");
		}
		//}
	}
}