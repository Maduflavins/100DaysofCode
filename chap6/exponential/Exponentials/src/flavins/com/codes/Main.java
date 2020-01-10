package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter number");
        int number = sc.nextInt();
        System.out.println("Please enter power");
        int power = sc.nextInt();
        integerPower(number, power);

    }

    private static void integerPower(int number, int power){
        int raisedToower = 1;
        int counter = 1;
        while (counter <= power){
            raisedToower*=number;
            counter++;
        }
        System.out.println(raisedToower);
    }
}
