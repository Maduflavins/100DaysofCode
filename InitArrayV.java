//7.15 (Command-Line Arguments) Rewrite Fig. 7.2 so that the size of the array is specified by the
//first command-line argument. If no command-line argument is supplied, use 10 as the default size
//of the array.

public class InitArrayV
{
	public static void main(String[] args)
	{
		//int[] array = new int[0]; 
		//int initialValue = 0, increment = 0;

		if (args.length == 2)
		{
			int[] array = new int[10];
			int initialValue = Integer.parseInt(args[0]);
			int increment = Integer.parseInt(args[1]);

			for (int i = 0; i < array.length; i++)
			{
				array[i] = initialValue + increment * i;
			}

			System.out.printf("%s%8s%n", "Index", "value");

			for (int i = 0; i < array.length; i++)
			{
				System.out.printf("%5d%8d%n", i, array[i]);
			}
		}
		else if (args.length == 3)
		{
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength];
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);

			for (int i = 0; i < array.length; i++)
			{
				array[i] = initialValue + increment * i;
			}

			System.out.printf("%s%8s%n", "Index", "value");

			for (int i = 0; i < array.length; i++)
			{
				System.out.printf("%5d%8d%n", i, array[i]);
			}
		}
		else
		{
			System.out.printf("Error: Please re-enter the entire command, including%n" + 
					  "an array size, initial value and increment.%n");
		}
	}
}