package flavins.com.codes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getArrays()));
//        System.out.println("=============================");
//       ;
        //System.out.println(Arrays.toString(getArrays()));

        //System.out.println(Arrays.sort(getArrays()));

    }

    private static int [] getArrays(){
        int [] array = new int[4];

        for(int i = 0; i < array.length; i++){
            System.out.println("Please enter number");
            int number = sc.nextInt();
            array[i] = number;

        }
        return array;
    }

    private static int [] printArray
}
