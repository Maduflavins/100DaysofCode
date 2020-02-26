import java.util.Scanner;

public class TotalSales
{
	public static void main (String[] args)
	{

		double[][] sales = new double[4][5];
		Scanner input = new Scanner(System.in);
		//System.out.printf("%s\t%s\t%s\t%s\t%s\t%s", "Product No.", "SalesPerson 1", "SalesPerson 2", "SalesPerson 3", "SalesPerson 4", "SalesPerson 5");

		
int salesManNumber, productNumber;
double productValue;

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
	}

	//public static void getSales

}

