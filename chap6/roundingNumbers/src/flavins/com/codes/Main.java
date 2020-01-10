package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter ");
        double number = scanner.nextDouble();
        double roundNumber = Math.floor(number);
        System.out.println("rounded number " + roundNumber);
        System.out.println("the original number: " + number);



    }
}
