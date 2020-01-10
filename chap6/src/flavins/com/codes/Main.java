package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter side of a square you want");
        int side = sc.nextInt();
        displayAsterisks(side);
    }

    static void displayAsterisks(int n) {
        int star = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }

            System.out.println();
            star++;
        }
    }
}
