public class NonsoPyramid
{
	public static void main (String[] args)
	{
		int x = 1;
		for (int v = 1; v <= 5; v++)
		{
			for (int z = 9; z >= v; z--)
			{
				System.out.print(" ");
			}
			for (int f = 1; f <= x; f++)
			{
				System.out.print(v);
			}   
			x = x + 2;
			System.out.println();
		}
	}
}