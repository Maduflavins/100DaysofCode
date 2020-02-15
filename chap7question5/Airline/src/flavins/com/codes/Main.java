package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static  boolean [] firstClass = new boolean[5];
    private static boolean [] economyClass = new boolean[5];

    private static int firstClassCounter = 0;
    private static int secondClassCounter = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        while (!quit){
            System.out.println("Please enter your choice (1-for firstclass, 2-for economy, or  -1 to quit)");
            int choice = sc.nextInt();
            sc.nextLine();
            if(firstClassCounter >= 5){
                System.out.println("First class is filled enter 3 to be assigned to economy class or -1 to quit");
                choice = sc.nextInt();
            }else if(secondClassCounter >= 5){
                System.out.println("The economy class is filled enter 4 to be assigned to a a seat in first class");
            }
            switch (choice){
                case 1:
                    firstClassFunc();
                    firstClassCounter++;
                    break;
                case 2:
                    seconClassFunc();
                    secondClassCounter++;
                    break;
                case 3:
                    if(firstClassCounter >= 5){
                    if(secondClassCounter < 5){
                        seconClassFunc();
                    }else{
                        System.out.println("This cabin is filled");
                    }

                }else {
                        System.out.println("First class is not filled yet enter 1 to get a seat on fist class cabin");
                    }

                    break;
                case 4:
                    if(secondClassCounter < 5){
                        if(firstClassCounter < 5){
                            firstClassFunc();
                        }else{
                            System.out.println("this cabin is filled");
                        }

                    }else{
                        System.out.println("second class cabin is not filled yet please enter 2 to get a seat on second class cabin");
                    }
                    break;

                case -1:
                    quit = true;
                    break;
            }

        }
        System.out.println("The seat is filled next flight leaves in 3 hours");

    }

    public static void firstClassFunc(){
        if(firstClassCounter < 5){
            for(int i = 0; i < firstClass.length; i++){
                firstClass[i] = true;

            }
            System.out.println("You have been assigned: " + "FC00"+(firstClassCounter+1));

        }

    }

    public static void seconClassFunc(){
        if(secondClassCounter < 5){
            for(int i = 0; i < economyClass.length; i++){
                economyClass[i] = true;

            }
            System.out.println("you have been assigned: " + "EC00"+(secondClassCounter+1));

        }


    }
}
