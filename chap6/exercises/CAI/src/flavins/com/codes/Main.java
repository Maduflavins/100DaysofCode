package flavins.com.codes;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static SecureRandom randomNuber = new SecureRandom();

    public static void main(String[] args) {
        askQuestion();
    }



    private static void askQuestion(){
        int number1 = 1 + randomNuber.nextInt(9);
        int number2 = 1 + randomNuber.nextInt(9);
        int number3 = 1 + randomNuber.nextInt(9);
        int number4 = 1 + randomNuber.nextInt(9);
        int multiple = number1 * number2;
        int multiple2 = number3 * number4;

        System.out.println("what is " + number1 + " times " + number2);
        int reply = scanner.nextInt();
        if(reply == multiple){
            System.out.println("correct answer so ");
            System.out.println("Please what is " + number3  + " times " + number4);
            int reply2 = scanner.nextInt();
            if(reply2== multiple2){
                System.out.println("correct answer");
            }else{
                System.out.println("Please what is " + number3  + " times " + number4);
                reply2 = scanner.nextInt();
            }
        }
        else{
            System.out.println("worng answer");
            System.out.println("what is " + number1 + " times " + number2);
            reply = scanner.nextInt();
        }
    }

}
