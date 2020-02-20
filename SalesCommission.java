/*public class SalesCommission
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int baseWage = 200;
		int grossPay = 0;
		//int newArray[];
		int[] salary = { 7000, 5000, 5000, 300, 2000, 4000, 3000, 5000, 7000, 8000, 900 };
		int[] frequency = new int[11];

		for (int i = 0; i < salary.length; i++)
		{
			int commission = (int) (salary[i] * 0.090);
			grossPay = baseWage + commission;
			grossPay = grossPay / 100;
			++frequency[grossPay];
			//System.out.println("Gross pay for salesman " + (i + 1) + " is " + grossPay);
		}

	System.out.println("Index\t\tValue");
	
	
	for (int j = 1; j < frequency.length - 1; j++)
	{
		if (j == 9)
		{
			System.out.printf("%3d and above: ", 1000);
		}
		else
		{
			System.out.printf("%d-%d: ", ((j + 1) * 100), (((j + 1) * 100) + 99));
		}

		for (int n = 0; n < frequency[j]; n++)
		{
			//System.out.print(frequency[n]);
			System.out.print("*");
		}
		System.out.println();
	}
}
}*/

public class SalesCommission
{
	public static void main(String[] args) 
	{
		double[] workerWage = { 0, 5000, 2000, 1500, 3200, 1000, 900, 4000, 9500, 500, 6000 };
		int[] frequency = new int[11];
		int mainWage = 0;
		
		for (int wage = 0; wage < workerWage.length; wage++)
		{
			mainWage = (int) (workerWage[wage] * 0.09);
			//System.out.println((mainWage + 200));
			++frequency[(mainWage + 200) / 100];
		}
		
		System.out.printf( "%s:%20s:\n", "Index", " Value"); // column heading
		
		for (int j = 2; j < frequency.length; j++)
		{
			if (j == 10)
			{
				System.out.printf("%3d and above: %8d", 1000, frequency[j]);
			}
			else
			{
				System.out.printf("%d-%d: %15d", ((j) * 100), (((j) * 100) + 99), frequency[j]);
			}
			
//			for (int c = 0; c < frequency[j]; c++)
//			{
//				System.out.print(frequency[j]);
//			}
			System.out.println();
		}
	}

}
