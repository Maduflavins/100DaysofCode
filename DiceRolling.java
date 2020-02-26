import java.util.Random;

public class DiceRolling
{
	public static void main (String args[])
	{
		Random randInt = new Random();
		int firstDie = 0;
		int secondDie = 0;
		int sumOfRolls = 0;

		int[] sumTally = new int[14];

		for (int i = 0; i < 36000000; i++)
		{
			firstDie = 1 + randInt.nextInt(6);
			secondDie = 1 + randInt.nextInt(6);
			sumOfRolls = firstDie + secondDie;
			//sumTally[i] = sumOfRolls;
			++sumTally[sumOfRolls];
		}
		
		System.out.printf( "%s:%20s:\n", "Sum of Die Faces", " Frequency of Sum"); // column heading

		for (int j = 1; j < sumTally.length - 1; j++)
		{
			System.out.printf("\t%02d%20d%n", j, sumTally[j]);
		}		
	}
}