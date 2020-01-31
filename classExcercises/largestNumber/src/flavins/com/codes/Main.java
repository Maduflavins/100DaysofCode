package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(max(49, 24, 10));
        System.out.println(max(15.4, 89.20, 55.6));
        //System.out.println(largestNumber());
    }

//    private static int largestNumber(){
//        System.out.println("enter four intergers separated by spaces");
//        int firstNumber = sc.nextInt();
//        int secondNumber = sc.nextInt();
//        int thirdNumber = sc.nextInt();
//        int fourthNumber = sc.nextInt();
//
//        int largestNumber = firstNumber;
//        if(secondNumber > largestNumber){
//            largestNumber = secondNumber;
//        }
//        if(thirdNumber > largestNumber){
//            largestNumber = thirdNumber;
//        }if(fourthNumber > largestNumber){
//            largestNumber = fourthNumber;
//
//        }
//        System.out.println("The largest number between " + firstNumber + " " + secondNumber + " "
//        + thirdNumber + " " + firstNumber + " is " );
//        return largestNumber;
//    }

    private static int max(int a, int b, int c){
        int largestNo = a;
        if(b > largestNo){
            largestNo = b;
        }
        if(c > largestNo){
            largestNo = c;
        }
        System.out.println("You are the first chcking");

        return largestNo;
    }


    private static double max(double a, double b, double c) {
        double largest = a;
        if (b > largest) {
            largest = b;
        }
        System.out.println("second check");
        if (c > largest) {
            largest = c;


        }

        return largest;
    }
}
