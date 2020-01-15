package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    displayDigis();

    }
    public static void twiLenghts(int a){
        int firstDigit = a / 10;
        int secondDigit = a % 10;
        System.out.println(firstDigit + " " + secondDigit);
    }

    public static  void threeLength(int a){
        int firstDigit = a / 100;
        int firstRemainder = a % 100;
        int secondDigit = firstRemainder / 10;
        int thirdDigit = firstRemainder % 10;

        System.out.println(firstDigit + " "  + secondDigit + " " + thirdDigit);


    }

    public static void fourLenth(int a){
        int firstDigit = a / 1000;
        int firstRemainder = a % 1000;
        int secondDigit = firstRemainder / 100;
        int secondDigitRemainder = firstRemainder % 100;
        int thirdDigit = secondDigitRemainder / 10;
        int fourDigit = secondDigitRemainder % 10;

        System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit+ " " + fourDigit);

    }

    public static void fifthLength(int a){
        int firstDigit = a/ 10000;
        int firstRemainder = a % 10000;
        int secondDigit = firstRemainder / 1000;
        int secondRemainder = firstRemainder % 1000;
        int thirdDigit = secondRemainder / 100;
        int thirdRemainder = secondRemainder % 100;
        int fourthDigit = thirdRemainder / 10;
        int fifthDigit = thirdRemainder % 10;

        System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + fourthDigit + " " + fifthDigit);
    }

    public static void displayDigis(){
        System.out.println("Please any digits numbers bwtween 1 to 99999 ");
        int number = sc.nextInt();
        int length = Integer.toString(number).length();

        if(length > 5){
            System.out.println(" Out of range of numbers");
        }else if( length == 1){
            System.out.println(number);
        }else{
            switch (length){
                case 2:
                    twiLenghts(number);
                    break;
                case 3:
                    threeLength(number);
                    break;
                case 4:
                    fourLenth(number);
                    break;
                case 5:
                    fifthLength(number);
                    break;
                default:
                    System.out.println("no implementation");
            }
        }
    }


}