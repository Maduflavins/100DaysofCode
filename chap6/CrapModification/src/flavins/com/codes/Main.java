package flavins.com.codes;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    private static Scanner sc =  new Scanner(System.in);
    private static int bankBalance = 1000;
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status {CONTINUE, WON, LOST};
    //constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    public static void main(String[] args) {
        System.out.println("Please enter hou much you are wagering");
        int wager = sc.nextInt();
        if(wager == 0 || wager > bankBalance){
            System.out.println("You cannt afford that amount please erenter aount wagering");
            wager = sc.nextInt();
        }
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON or LOST
        int sumOfDice = rollDice(); // first roll of the dice
// determine game status and point based on first roll
        switch (sumOfDice) {
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll
                gameStatus = Status.WON;
                bankBalance = bankBalance + wager;
                System.out.println("Your bank Balance: " + bankBalance);
                break;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                gameStatus = Status.LOST;
                bankBalance = bankBalance - wager;
                chatter();
                System.out.println("Your new bank balnce is " + bankBalance);
                break;
            default: // did not win or lose, so remember point
                gameStatus = Status.CONTINUE; // game is not over
                myPoint = sumOfDice; // remember the point
                System.out.printf("Point is %d%n", myPoint);
                break;
        }
// while game is not complete
        while (gameStatus == Status.CONTINUE) { // not WON or LOST
            sumOfDice = rollDice(); // roll dice again
// determine game status
            if (sumOfDice == myPoint) { // win by making point
                gameStatus = Status.WON;
                bankBalance = bankBalance + wager;
                System.out.println("your new bank balance is: " +  bankBalance);
            }
            else {
                if (sumOfDice == SEVEN) { // lose by rolling 7 before point
                    gameStatus = Status.LOST;
                    bankBalance = bankBalance - wager;
                    chatter();
                    System.out.println("Your new balance is: " + bankBalance);
                }
            }
        }
// display won or lost message
        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
        }
else {
            System.out.println("Player loses");
        }
    }
    //roll dice, calculate sum and display results
    public static int rollDice() {
// pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll
        int sum = die1 + die2; // sum of die values
// display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    public static void chatter(){
        if(bankBalance == 0){
            System.out.println("You are busted");
        }else if(bankBalance == 500){
            System.out.println("Oh you are going for broke ");
        }else if(bankBalance> 1000 ){
            System.out.println("your up big");
        }else if(bankBalance == 700){
            System.out.println("Take the chance");
        }
    }
}
