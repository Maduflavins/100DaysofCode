package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("please enter number");
        double number = sc.nextDouble();
        System.out.println(roundToInteger(number));
        roundToTenths(number);
        roundToHundredths(number);
        roundToThousandths(number);
    }


    private static int roundToInteger(double number){
        int roundedNumber = (int)Math.floor(number);
        System.out.println("original number is: " + number);
        return  roundedNumber;


    }

    private static  void  roundToTenths(double number){
        double roundedNumber = Math.floor(number * 10 + 0.5)/10;
        System.out.println("Original number: " + number);
        System.out.println("Rounded Number: " + roundedNumber);
    }

    private static  void roundToHundredths(double number){
        double roundedNumber = Math.floor(number * 100 + 0.5 ) / 100;
        System.out.println("Original Number: " + number + " rounded number: " + roundedNumber);

    }

    private static void roundToThousandths(double number){
        double roundedNumber = Math.floor(number * 1000 + 0.5)/1000;
        System.out.println("Original Number + " + number + " Rounded number: " + roundedNumber);
    }
}
