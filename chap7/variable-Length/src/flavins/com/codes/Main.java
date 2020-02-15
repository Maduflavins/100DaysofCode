package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int no1 = 34;
        int n02 = 45;
        int no3 = 12;
        int no4 = 13;
        System.out.println("the product of your numbers is " + productOfNumbers(no1, n02, no3, no4));
    }

    private static int productOfNumbers(int ... numbers){
        int product = 1;
        for(int array : numbers){
            product*=array;

        }
        return product;


    }
}
