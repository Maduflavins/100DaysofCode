import java.util.Scanner;
import java.util.Arrays;
public class DuplicateElimination
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of values: ");
		int value = input.nextInt();
		int[] num = new int[value];

		for (int i = 0; i < num.length; i++)
		{
			System.out.print("Enter a number: ");
			int n = input.nextInt();
			int location = Arrays.binarySearch(num, n);

			if(location >= 0)
			{
				System.out.printf("Found %d at element %d in the array%nPlease enter a different value: ", n, location);
				n = input.nextInt();
				num[i] = n;
				System.out.println("The array of numbers is " + Arrays.toString(num));
			}
			else
			{
				num[i] = n;
				System.out.println("The array of numbers is " + Arrays.toString(num));
			}			
		}
		System.out.println("The final array of numbers is " + Arrays.toString(num));
	}
}