package flavins.com.codes;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();


        for(int i = 0; i<=4; i++){
            System.out.println(isMultiple(num1, num2));
            System.out.println("Please enter first number");
            num1 = sc.nextInt();
            System.out.println("Enter second number");
            num2 = sc.nextInt();

        }

    }

    private static boolean isMultiple(int num1, int num2){
        if (num1 % num2 == 0){
            return true;
        }
        return false;
    }
}
