package flavins.com.codes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    isPerfect(100000000);
    }




    private static void isPerfect(int number){
        int i = 1;
        int sum = 0;
        for(i = 1; i < number; i++){
            if(number % i == 0){
                System.out.println(" the factors are :  " + i );
                sum = sum + i;

            }
        }
        if(sum == number){
            System.out.println(number + " is a perfect number");

        }else{
            System.out.println(number + " is not a perfect number ");
        }
    }
};
