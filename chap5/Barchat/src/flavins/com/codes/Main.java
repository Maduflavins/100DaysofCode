package flavins.com.codes;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number");
        int entry = sc.nextInt();
	// write your code here

        for(int i = 1; i <=entry; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
