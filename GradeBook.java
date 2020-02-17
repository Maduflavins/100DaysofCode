public class GradeBook
{
	private String courseName;
	private int[] grades;

	//the constructor
	public GradeBook(String courseName, int[] grades)
	{
		this.courseName = courseName;
		this.grades = grades; //No need to always show proud array
	}

	//Method to set course name
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}

	//method to get course name
	public String getCourseName()
	{
		return courseName;
	}

	public void processGrades()
	{
		outputGrades();
		System.out.printf("%nClass average is %.2f%n", getAverage());

		System.out.printf("Lowest grade: %d%nHighest grade: %d%n%n", getMinimum(), getMaximum());

		outputBarChart();
		
	}

	public int getMinimum()
	{
		int lowGrade = grades[0]; //Assume grades[0] is the smallest

		for (int grade : grades)
		{
			if (grade < lowGrade) //Compare the newly-entered grade with lowest
			{
				lowGrade = grade; //if less, interchange lowest value
			}
		}
		return lowGrade;
	}

	public int getMaximum()
	{
		int highGrade = grades[0]; //sets first entered number as highest

		for (int grade : grades)
		{
			if (grade > highGrade)
			{
				highGrade = grade;
			}
		}
		return highGrade;		
	}

	public double getAverage()
	{
		int total = 0;

		for (int grade : grades)
		{
			total += grade;
		}
		return (double) total / grades.length;
	}

	public void outputBarChart()
	{
		System.out.println("Grades distribution: ");

		int[] frequency = new int[11];

		// for each grade, increment the appropriate frequency
		for (int grade : grades)
		{
			++frequency[grade / 10];
		}

		for (int i = 0; i < frequency.length; i++)
		{
			if (i == 10)
			{
				System.out.printf("%5d: ", 100);
			}
			else
			{
				System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
			}

			for (int stars = 0; stars < frequency[i]; stars++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void outputGrades()
	{
		System.out.printf("The grades are: %n%n");

		for (int j = 0; j < grades.length; j++)
		{
			System.out.printf("Student %2d: %3d%n", j + 1, grades[j]);
		}
	}
}