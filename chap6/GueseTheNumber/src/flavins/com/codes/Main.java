package flavins.com.codes;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static  SecureRandom randomNumber = new SecureRandom();

    public static void main(String[] args) {
        int number = 1 + randomNumber.nextInt(100);
        System.out.println("Enter guess");
        int guess = sc.nextInt();
        int guessCount = 0;
        while (guess != 0){
            if (guess > number){
                System.out.println("Too hhigh guess a little lower");
            }
            else if(guess < number){
                System.out.println("Too low guess a little highrt");
            }else{
                System.out.println("correct the guessed number is: " + number);
                System.out.println("Guess another number or 0 to quit");
                guess = sc.nextInt();
            }
            System.out.println("Enter guess");
            guess = sc.nextInt();
//            if(guess == 0){
//                System.out.println("Quitting game now");
//                break;
//            }

            guessCount++;
        }
        System.out.println("Thank you for your time");
        if(guessCount < 10){
            System.out.println("Either you know the secret or you got lucky");
        }else if(guessCount == 10){
            System.out.println("You know the secrer");
        }else{
            System.out.println("You should be able to do better next time");
        }
    }
}
