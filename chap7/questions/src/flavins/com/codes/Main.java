package flavins.com.codes;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    private static Random randomNumber = new Random();

    public static void main(String[] args) {
//        int sum = 0;
//        int [] freq = new int[13];
//        for(int roll = 1; roll <= 36000000; roll++){
//            int number1 = 1 + randomNumber.nextInt(6);
//            int number2 = 1 + randomNumber.nextInt(6);
//            sum = number1 + number2;
//
//            //System.out.println("number 1: " + number1 + " number 2: " + number2 + " sum =  " + sum);
//
//
//        }
//
//        for(int counter = 2; counter< freq.length; counter++){
//            System.out.println(counter + " " + freq[counter]);
//
//        }

        int [] sumOfArray = rollDice();
        calculateFrequency(sumOfArray);
//
}


    public static int [] rollDice(){
        int [] sum = new int[36000000];
        for(int roll = 1; roll< sum.length; roll++){
            int number1 = 1 + randomNumber.nextInt(6);
            int number2 = 1 + randomNumber.nextInt(6);
            sum[roll] = number1 + number2;
        }
        return sum;
    }

    public static void calculateFrequency(int [] array){
        int [] frquency = new int[13];
        for(int counter = 0; counter < array.length; counter++){
            try{
                ++frquency[array[counter]];
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }

        for(int rating=2; rating < frquency.length; rating++){
            System.out.println(rating + " " + frquency[rating]);
        }




    }
}
