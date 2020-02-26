public class SampleArray
{
	public static void main (String[] args)
	{

		/*int[] arrayName = new int[10];
	//String[] args

		System.out.printf("%s%8s%n", "Index", "Value");

		for (int i = 0; i < arrayName.length; i++)
		{
			System.out.printf("%d%8d%n", i, (arrayName[i] + 1));
		}*/

		int[] array = new int[100];

		System.out.println("The Summary Table is shown below:");
		System.out.println("_________________________________");
		int a = 1;

		for (int i = 0; i < array.length; i++)
		{
			if ((i + 1) % 10 == 0)
			{
				++a;
				System.out.println();
			}
			array[i] = 2;
			System.out.printf("%02d ", array[i]);
		}
	}
	
}