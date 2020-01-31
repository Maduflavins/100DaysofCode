package flavins.com.codes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

	int [] array = new int[5];
	for(int i=0; i<array.length; i++){
        System.out.println("Please enter number between 10 - 100");
        int number = sc.nextInt();
        if(number == 10 || number <= 100){
            for(int num: array){
                if(num == number){
                    System.out.println("Number already exist");
                }else{
                    array[i] = number;
                    System.out.println(Arrays.toString(array));
                }
            }

        }else{
            System.out.println("Invalid number");
        }
    }
    }
}
