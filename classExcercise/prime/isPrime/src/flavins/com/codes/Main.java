package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	   // isPrime();
        int counter = 0;
        while (counter < 10){
            System.out.println("hi");
            counter++;
        }
    }


    private static void isPrime(){
        System.out.println("Please enter a nuber");

        int number = sc.nextInt();
        if(number > 0){
            if(number == 1){
                System.out.println(number + " is not a prime number cos it has only one factor");
            }else{
                boolean flag = true;

                for(int i = 2; i <= Math.sqrt(number); i++){
                    System.out.println("u");
                    if(number % i == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag == false){
                    System.out.println(number + " is not a prime number ");
                }else{
                    System.out.println(number + " is a prime number");
                }
            }
        }else{
            System.out.println(" we are not checking negtive numbers and zeros here");
        }

    }

//    private static void anotherPrime()

}
