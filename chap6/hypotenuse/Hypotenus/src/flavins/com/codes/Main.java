package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter first side ");
        double side1 = sc.nextDouble();
        System.out.println("Please enter second side");
        double side2 = sc.nextDouble();
        System.out.println(hypotenus(side1, side2));
    }

    private static double hypotenus(double side1, double side2){
        side1 = Math.pow(side1,side1);
        side2 = Math.pow(side2, side2);

        double hypotenus = Math.floor(Math.sqrt(side1 + side2));
        return hypotenus;
    }

}
