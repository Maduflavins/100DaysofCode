import java.util.Arrays;

public class TotalSalesII
{	
	private double[][] sales;
	private int salesPerson;
	private int productNumber;

	//The constructor
	public TotalSalesII(double[][] sales)
	{
		//this.salesPerson = salesPerson;
		//this.productNumber = productNumber;
		this.sales = sales;
	}

	public void setSalesPerson(int salesPerson)
	{
		this.salesPerson = salesPerson;
	}

	public int getSalesPerson()
	{
		return salesPerson;
	}

	public void setProductNumber(int productNumber)
	{
		this.productNumber = productNumber;
	}

	public void processSales()
	{
		displaySales();
	}

	public double getProductSum(double[] salesSet)
	{
		double total = 0.0;

		for (double sale : salesSet)
		{
			total += sale;
		}
		return total;
	}

	public void displaySales()
	{		
		double[] manSales = {0.0};
		double colSum = 0.0;

		System.out.print("Product No.\t");
		for (int person = 0; person < sales[0].length; person++)
		{
			System.out.printf("Sales Person %d\t", (person + 1));
		}
		System.out.println("Product Total");
		System.out.println();

		for (int product = 0; product < sales.length; product++)
		{
			System.out.printf("Product %d", (product + 1));

			for (double prod : sales[product])
			{
				System.out.printf("%16.2f", prod);
				manSales[salesPerson] = sales[productNumber][salesPerson];
				colSum += sales[productNumber][salesPerson];
			}

			double rowSum = getProductSum(sales[product]);
			System.out.printf("%17.2f%n", rowSum);
		}
		
		System.out.print("SalesMan Total");


		for (int j = 0; j < 5; j++)
		{
			//System.out.printf("  %8.2f\t", manSales[salesPerson]);
			System.out.printf("  %8.2f\t", colSum);
		}
			System.out.println();
	}

	public double[] columnSum(double[][] array)
	{
		int size = array[0].length + 1;
		double temp[] = new double[size];
			
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				temp[j] += array[i][j];
			}
		}
		System.out.println(Arrays.toString(temp));
		return temp;
	}

		/*public double getColumnSum(double[] salesSet)
		{
			double total = 0.0;

			for (double[] sale : salesSet)
			{
				total += sale;
			}
			return total;
		}*/
	}
