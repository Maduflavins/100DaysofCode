package flavins.com.codes;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.security.SecureRandom;

public class Main {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status {CONTINUE, WON, LOST};
    private static final int SNAKE_EYES = 2;
    private static  final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;


    public static void main(String[] args) {

//        int myPoint = 0;
//
//        Status ganeStatus;
//
//        int sumOfDice = rollDice();
//
//        switch(sumOfDice){
//            case SEVEN:
//            case YO_LEVEN:
//                ganeStatus = Status.WON;
//                break;
//            case SNAKE_EYES:
//            case TREY:
//            case BOX_CARS:
//                ganeStatus = Status.LOST;
//                break;
//            default:
//                ganeStatus = Status.CONTINUE;
//                myPoint = sumOfDice;
//                System.out.printf("Point is %d%n", myPoint);
//                break;
//
//        }
//        while(ganeStatus==Status.CONTINUE){
//            sumOfDice = rollDice();
//            if(sumOfDice == myPoint){
//                ganeStatus = Status.WON;
//            }else{
//                if(sumOfDice == SEVEN){
//                    ganeStatus = Status.LOST;
//                }
//            }
//        }
//        if(ganeStatus == Status.WON){
//            System.out.println("Player wins");
//        }else{
//            System.out.println("Player loses");
//        }
//
//
//    }
//
//    public static int rollDice(){
//        int die1 = 1 + randomNumbers.nextInt(6);
//        int die2 = 1 + randomNumbers.nextInt(6);
//        int sum = die1 + die2;
//        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
//        return sum;

        double x = Math.abs(7.5);
        System.out.println("x " + x);

        double y = Math.floor(7.5);
        System.out.println("y: " + y);

        double z = Math.abs(0.0);
        System.out.println("z " + z);

        double t = Math.abs(-6.4);
        System.out.println("t: " + t);

        double b = Math.ceil(-6.4);
        System.out.println("b: " + b);

        double f = Math.ceil((-Math.abs(-8 + Math.floor(-5.5)));
        System.out.println("f: " + f);
    }
}
