package flavins.com.codes;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static SecureRandom randomNumber = new SecureRandom();

    public static void main(String[] args) {


        askQuestion();
    }




    private static void level1(){
        int counter = 0;
        int worngAnswerCount = 0;
        int correctAnswerCount = 0;
        while(counter <= 10){
            int number1 = 1 + randomNumber.nextInt(9);
            int number2 = 1 + randomNumber.nextInt(9);

            int answer = number1 * number2;

            System.out.println("how much is " + number1 + " X " + number2);
            int reply = sc.nextInt();
            while (reply != answer){
                int wrongNumber = 1 + randomNumber.nextInt(4);
                worngAnswerCount++;

                switch (wrongNumber){
                    case 1:
                        System.out.println("No. Please Try again");
                        break;
                    case 2:
                        System.out.println("Worng. Try once more");
                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        break;
                    case 4:
                        System.out.println("No. Keep trying");
                        break;
                }
                System.out.println("how much is " + number1 + " X " + number2);
                reply = sc.nextInt();


            }
            int rightAnswer = 1 + randomNumber.nextInt(4);

            switch (rightAnswer){
                case 1:
                    System.out.println("Very good!");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice work!");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
            correctAnswerCount++;
            counter ++;

        }
        int percetageOfRight = (correctAnswerCount / counter) * 100;

        int percentageOfWrong = (worngAnswerCount / counter ) * 100;

        if(percentageOfWrong > 0.75){
            System.out.println(" You need to see your teacher for some help");
        }else{
            System.out.println("Cingratulations you are now ready to move to the next phase");
        }



    }

    private static void level2(){
        int counter = 0;
        int worngAnswerCount = 0;
        int correctAnswerCount = 0;
        while(counter <= 10){
            int number1 = 10 + randomNumber.nextInt(10);
            int number2 = 10 + randomNumber.nextInt(10);

            int answer = number1 * number2;

            System.out.println("how much is " + number1 + " X " + number2);
            int reply = sc.nextInt();
            while (reply != answer){
                int wrongNumber = 1 + randomNumber.nextInt(4);
                worngAnswerCount++;

                switch (wrongNumber){
                    case 1:
                        System.out.println("No. Please Try again");
                        break;
                    case 2:
                        System.out.println("Worng. Try once more");
                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        break;
                    case 4:
                        System.out.println("No. Keep trying");
                        break;
                }
                System.out.println("how much is " + number1 + " X " + number2);
                reply = sc.nextInt();


            }
            int rightAnswer = 1 + randomNumber.nextInt(4);

            switch (rightAnswer){
                case 1:
                    System.out.println("Very good!");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice work!");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
            correctAnswerCount++;
            counter ++;

        }
        int percetageOfRight = (correctAnswerCount / counter) * 100;

        int percentageOfWrong = (worngAnswerCount / counter ) * 100;

        if(percentageOfWrong > 0.75){
            System.out.println(" You need to see your teacher for some help");
        }else{
            System.out.println("Cingratulations you are now ready to move to the next phase");
        }



    }

    private static void  askQuestion(){
        System.out.println("Please select level choice 1 or 2");
        int levelChoice = sc.nextInt();

        switch (levelChoice){
            case 1:
                level1();
                break;

            case 2:
                level2();
                break;

        }

    }
}


