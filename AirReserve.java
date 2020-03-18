import java.util.Scanner;

public class AirReserve
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);

		boolean[] planeChart = new boolean[10];

		System.out.print("Choose 1 for First Class or 2 for Economy: ");
		int seatType = sc.nextInt();
		int totalSeatNumber = 10;
		int i = 1;
		int seatNum;

		greeting();
		while (i <= totalSeatNumber)
		{
			if (seatType == 1)
			{
				//System.out.println("Call method for First Class");
				System.out.print("Please select a seat number between 1 and 5: ");
				seatNum = sc.nextInt();
				while (seatNum > 5)
				{
					System.out.print("Please select a seat in range 1 to 5 for First Class: ");
					seatNum = sc.nextInt();
				}
				int index = seatNum - 1;
				//System.out.println("The index for the seat is " + index);
				if (planeChart[index] == false)
				{
					System.out.println("You have been assigned seat " + seatNum + " in the First Class");
					planeChart[index] = true;
					break;
				}
				else
				{
					System.out.print("Seat is taken. Except Seat Number " + seatNum + ",");
					System.out.println("Please select another seat in range 1 to 5 for First Class: ");
					seatNum = sc.nextInt();
				}
			}
			else if (seatType == 2)
			{
				//System.out.println("Call method for Economy");
				System.out.print("Please select a seat number between 6 and 10: ");
				seatNum = sc.nextInt();
				while (seatNum <= 5 || seatNum > 10)
				{
					System.out.print("Please select a seat in range 6 to 10 for Economy Class: ");
					seatNum = sc.nextInt();
				}
			}
			i++;
		}
	}

	public static void greeting()
	{
		 System.out.println("\nWelcome to Crap Airlines booking system.\n");
	}
}

	

	/*public void getFirstClassSeat()
	{
		for (int i = 1; i <= 5; i++)
		{
			
		}
	}*/