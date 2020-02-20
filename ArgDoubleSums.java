public class ArgDoubleSums
{
	public static void main (String[] args)
	{
		double total = 0.0;

		for (String i : args)
		{
			double x = Double.parseDouble(i);
			total += x;
		}
		System.out.println(total);
	}
}