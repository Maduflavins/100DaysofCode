public class GradeBookIITest
{
	public static void main(String args[])
	{
		int[][] gradesArray =	{{87, 96, 70},
				      	 {68, 87, 90},
					 {94, 100, 90},
					 {83, 65, 85},
					 {78, 87, 65},
					 {85, 75, 83},
					 {91, 94, 100},
					 {76, 72, 84},
					 {87, 93, 73}};

		GradeBookII myGradeBook = new GradeBookII ("CS101 Introduction to Java Programming", gradesArray);
		System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
		myGradeBook.processGrades();
	}
}

/*Welcome to the grade book for
CS101 Introduction to Java Programming

The grades are:

          Test 1 Test 2 Test 3 Average
Student  1      87      96      70    84.33
Student  2      68      87      90    81.67
Student  3      94     100      90    94.67
Student  4      83      65      85    77.67
Student  5      78      87      65    76.67
Student  6      85      75      83    81.00
Student  7      91      94     100    95.00
Student  8      76      72      84    77.33
Student  9      87      93      73    84.33

Lowest grade in the grade book is 65
Highest grade in the grade book is 100

Overall grade distribution:
00-09:
10-19:
20-29:
30-39:
40-49:
50-59:
60-69: ***
70-79: ******
80-89: *********
90-99: *******
  100: ** */