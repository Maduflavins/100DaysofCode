package flavins.com.codes;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

//        SecureRandom randomNumber = new SecureRandom();

//        int counter = 1;
//        int sum = 0;
//        int x = 2;
//        int constNumbber = 6;
//
//        while (counter <= 20){
//
//            counter++;
//             //sum = constNumbber + counter + (counter + 1);
//
//            if(counter + (counter + 1) + constNumbber == 21){
//                continue;
//            }
//            System.out.println(counter + " " + (counter + 1) + " " + (constNumbber + counter + (counter + 1)));
//
//
//        }

//        for(int i = 20; i>= 1; i--){
//            System.out.println(i);
//        }

        System.out.println("Plese enter number of times you want to check");

        int number = sc.nextInt();

        int smallestNumber = 2147483647;

        for(int i=0; i<=number; i++ ){
            System.out.println("Please enter number");
            int newNumber = sc.nextInt();
            if(newNumber < smallestNumber){
                smallestNumber = newNumber;
            }
        }
        System.out.println(" The smallest number you entered is: " + smallestNumber);

    }

}
