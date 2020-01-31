package flavins.com.codes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        getFrequecy(totalPay());
    }


    private static int [] totalPay(){
        final int WEEKLY_PAY = 200;

        int [] pay = new int [10];

        for(int i=0; i<10; i++){
            System.out.printf("Enter " + (i+1) + " aount of goods sold ");
            int amount_sold = sc.nextInt();

            double percentage_sales = 0.09 * amount_sold;
            int gross_pay = WEEKLY_PAY + (int)percentage_sales;
            pay[i] = gross_pay;
        }
        return pay;


    }

    private static void getFrequecy(int [] array){
        int [] frequency = new int[11];

        for(int pay: array){
            ++frequency[pay/100];


        }
        System.out.printf("%s%30s%n", "Frequency", "population");
        for(int counter = 0; counter < frequency.length; counter++){
            if(counter == 10){
                System.out.printf("%d%n", 1000);
            }else{
                System.out.printf("%03d-%03d%n", counter * 100, counter * 100 + 99);
            }

            for(int i = 0; i<frequency[counter]; i++){
                System.out.printf("%30d%n", i);
            }

        }
    }




}
