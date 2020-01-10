package flavins.com.codes;

import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Please enter number to run and 0 to quit");
        int entry = scanner.nextInt();
        scanner.nextLine();

        //boolean quit = false;
        while(entry!=0) {
            calculateCharges();
            System.out.println("Please enter number to run and 0 to quit");
            entry = scanner.nextInt();
            scanner.nextLine();

        }


    }
    public static void calculateCharges(){
        double totalCharges = 0;
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Please enter the total hours spent yestertday in the parking lot");
            double parkingHour = scanner.nextDouble();
            scanner.nextLine();
            if(parkingHour > 24){
                System.out.println("Sorry the park does not work more than 24 hours");
            }else if(parkingHour == 24){
                totalCharges = 10.00;

            }else if(parkingHour <= 3.00){
                totalCharges = 2.00;
            }if(parkingHour > 3.00){
                double additionalHour = parkingHour % 3;
                double chargeForAdditionalHour = 0.50 * additionalHour;
                totalCharges = additionalHour + chargeForAdditionalHour;

        }

        System.out.println("Hi " + name + " your total charge for yesterday is " + totalCharges);

    }
}
