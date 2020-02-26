import java.util.Scanner;

public class TotalSalesIITest
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);

		int salesManNumber, productNumber;
		double productValue;
		double[][] sales = new double[4][5];

		System.out.print("Please enter the salesman's number: ");
		salesManNumber = input.nextInt();

		while (salesManNumber != -1)
		{
			System.out.print("Enter product number: ");
			productNumber = input.nextInt();

			System.out.print("Enter product value: ");
			productValue = input.nextDouble();

			sales[productNumber - 1][salesManNumber - 1] += productValue;
	
			System.out.print("Please enter the salesman's number: ");
			salesManNumber = input.nextInt();
	
		}

		TotalSalesII mySales = new TotalSalesII(sales);
		
		mySales.processSales();

		System.out.println(mySales.columnSum(sales));
	}
}