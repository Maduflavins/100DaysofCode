package flavins.com.codes;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	    tempConverter();
    }

    public static double celsius(double fahrenheit){
        return (5.0/9.0) * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius){
        return (9.0 / 5.0) * (celsius + 32);
    }

    public static void tempConverter(){
        System.out.println("enter 1 for celsius converter or 2 for fahreenheit converter");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println(" Enter fahreneit temperature");
                double value = sc.nextDouble();
                System.out.println( "Your celsius equivalent is " + celsius(value));
                break;
            case 2:
                System.out.println("Enter celsius temperature");
                double val = sc.nextDouble();
                System.out.println("Your faherient eqivalennt is: " + fahrenheit(val));
                break;
            default:
                System.out.println("Not a valid entery");
        }
    }
}
