package flavins.com.codes;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static SecureRandom randomNumber = new SecureRandom();

    public static void main(String[] args) {
//
//        long resultOfEven = 1;
//        long resultOfOdd = 1;
//
//        for(int i = 1; i<= 40; i++){
//            if(i % 2 == 0){
//                resultOfEven = resultOfEven * i;
//            }
//            if(i % 2 != 0){
//                resultOfOdd = resultOfOdd*i;
//            }
//
//
//        }
//        System.out.println("product of even numbers is : " + resultOfEven + " product f odd numbers: " + resultOfOdd);


//        int numbergen = 1 + randomNumber.nextInt(20);
//
//       for(int i = 1; i<=40; i++){
//           int number = 1 + randomNumber.nextInt(20);
//           //System.out.print(number + " ");
//           if(number % 3 == 0){
//               System.out.println(number);
//           }
//       }



//        long factorial = 1;
//        long number = 20;
//        System.out.printf("%s%20s%n", "Number", "Factorial");
//	    for(long i = 1; i <= number; i++){
//	        factorial = factorial * i;
//            System.out.printf("%d%20d%n", i, factorial);
//
//        }
//        System.out.println("Please enter how much numbers you plan to check out");
//
//        int numbToCheck = sc.nextInt();
//
//        int smallestNumber = Integer.MAX_VALUE;
//        int highestNumber = Integer.MIN_VALUE;
//
//        for(int i = 1; i<=numbToCheck; i++){
//            System.out.println("Please enter number");
//
//            int entry = sc.nextInt();
//
//            if(entry > highestNumber){
//                highestNumber = entry;
//            }
//            if(entry < smallestNumber){
//                smallestNumber = entry;
//            }
//        }
//
//        System.out.println("Lagers Number is: " + highestNumber + " " + " smallest Number is: " + smallestNumber);
       // System.out.println(factorial);

//
//        int product = 1;
//        for(int i = 1; i<= 15; i++){
//            if(i %2 !=0){
//                product*=i;
//                System.out.println("number: " + i + " " + "Products: " + " " + product);
//            }
//
//        }
//
//        for(int i = 0; i<=10; i++){
//            for(int j = 10; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //System.out.print("*********");
        int star = 10;
        int space = 1;
        for(int i = 0; i<=10; i++){
                for(int spa=1; spa<=space; spa++){
                    System.out.print(" ");
                }
                for(int sta = 1; sta<=star; sta++){
                    System.out.print("*");
                }

                star--;
                space++;
            System.out.println();


        }

    }
}
