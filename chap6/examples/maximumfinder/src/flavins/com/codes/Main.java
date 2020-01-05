package flavins.com.codes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three floating-point values separated by spaces: ");

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();


        double result = maximum(number1, number2, number3);
        System.out.println("the maximun valye is: " + result);

    }

    public static double maximum(double x, double y, double z){
        double maximumValue = x;

        if(y>maximumValue){
            maximumValue = y;
        }if(z > maximumValue){
            maximumValue = z;
        }
        return maximumValue;
    }
}
