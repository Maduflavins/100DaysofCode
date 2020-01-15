package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	    minimum3();
    }

    public static void minimum3(){
        System.out.println("Please enter three floating points numbers separated by spaces");
        double numb1 = sc.nextDouble();
        double numb2 = sc.nextDouble();
        double numb3 = sc.nextDouble();

        double minimun = Math.min(numb1, Math.min(numb2, numb3));
        System.out.println("The miniumn value is : " + minimun);

    }
}
