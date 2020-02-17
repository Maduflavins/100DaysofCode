import java.util.Scanner;

public class VarArgList
{
	public static void main(String args[])
	{
		/*Scanner input = new Scanner(System.in);

		System.out.print("Enter number of figures to multiply: ");
		int value = input.nextInt();
		int[] figure = new int[value];

		for (int i = 0; i < figure.length; i++)
		{
			System.out.print("Enter a value: ");
			int num = input.nextInt();
			figure[i] = num;
			product(figure[i]);
			System.out.println("The product is " + product(figure[i]));
		}*/
		//System.out.println("The product is " + product(figure[i]));
	
		int d1 = 2;
		int d2 = 4;
		int d3 = 6;
		int d4 = 8;

		System.out.printf("d1 = %d%nd2 = %d%nd3 = %d%nd4 = %d%n%n", d1, d2, d3, d4);
		System.out.printf("Product of d1 and d2 is %d%n", product(d1, d2));
		System.out.printf("Product of d1, d2 and d3 is %d%n", product(d1, d2, d3));
		System.out.printf("Product of d1, d2, d3 and d4 is %d%n", product(d1, d2, d3, d4));
	}
	public static int product(int... number)
	{
		int total = 1;

		for (int num : number)
		{
			total *= num;
		}
		return total;
	}
}