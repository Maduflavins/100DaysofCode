import java.util.Scanner;

public class IsPrimeI
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.println("Please enter a nuber");

        int number = input.nextInt();
        if(number > 0){
            if(number == 1){
                System.out.println(number + " is not a prime number cos it has only one factor");
            }else{
                boolean flag = true;

                for(int i = 2; i <= Math.sqrt(number); i++){
                   // System.out.println("u");
                    if(number % i == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag == false){
                    System.out.println(number + " is not a prime number ");
                }else{
                    System.out.println(number + " is a prime number");
                }
            }
        }else{
            System.out.println(" we are not checking negtive numbers and zeros here");
        }

		/*System.out.print("Enter a number to check if it is a prime: ");
		int num = input.nextInt();

		for (int i = 2; i < Math.sqrt(num); i++)
		{
			if (num / i == 0)
			{
				System.out.println("Number is a prime");
				break;
			}
			else
			{
				System.out.println("Number is not a prime");
			}
		}*/
	}
}