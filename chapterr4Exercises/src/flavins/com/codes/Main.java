package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//	    int counter = 0;
////
//	    while(counter < 5){
//            //System.out.println((counter+1)+ ". " + "Hello World");
//            System.out.printf("%d%s%s%n", counter+1, ".", "Hello world");
//            counter = counter + 1;
//        }

//        int counter = 1;
//
//        while(counter <=5){
//            if(counter == 3){
//                System.out.println(counter   + ". " + " Hello Nigeria How are you doing");
//                counter++;
//            }
//            System.out.println(counter + ". " + " Hello Nigeria");
//
//            counter++;
//        }

//        int counter = 0;
//        while (counter<=4){
//            System.out.println("Please enter score: ");
//            int score = sc.nextInt();
//            if(score >= 90){
//                System.out.println("A");
//            }else if(score < 90 && score >= 80){
//                System.out.println("B");
//            }else if(score < 80 && score >= 70){
//                System.out.println("C");
//            }else if(score < 70 && score >= 60){
//                System.out.println("D");
//            }else {
//                System.out.println("F");
//            }
//            counter++;
//        }
//        System.out.println(" Please enter the amount of even numbers you wnant to calculate:");
//        int n = sc.nextInt();
//        if(n > 20){
//            System.out.println(" We will be working with just first 20");
//            n = 20;
//        }
//        int sumOFEven= 0;
//        int counter = 1;
//        while(counter <= 2*n){
//            if(counter % 3 == 0){
//                sumOFEven+=counter;
//
//            }
//            //System.out.println(counter);
//            counter++;
//        }
//
//        System.out.println(sumOFEven);

//        int counter = 0;
//        int sum = 0;
//        while (counter <= 7){
//            sum  = sum + counter;
//            if(sum % 6 == 0){
//                sum = sum - counter;
//            }
//            System.out.println(counter+1 + " counter:" + counter + " sum: " + sum);
//            //System.out.println("counter:" + counter);
//            counter++;
//
//        }
//        System.out.println("sum of nos: " + sum);


//
//        int i = 1;
//        while (i < 5){
//            int x = 0;
//            while (x<i){
//                System.out.print("*");
//                x++;
//            }
//            System.out.println();
//            i++;
//        }
//        int n = 4;
//        int counter = 1;
//
//        while (counter <= 4){
//            int i = 0;
//            while (i<=n){
//                System.out.print("*");
//                i++;
//            }
//            System.out.println();
//            counter++;
//        }

//        int i = 1;
//        while (i<5){
//            int x = 0;
//            while (x <i){
//                System.out.print("*");
//                x++;
//            }
//            System.out.println();
//            i++;
//        }
//
//    int space = 10;
//    int counter = 1;
//
//    while (counter <= 4){
//        int sp = 0;
//        int star1 = 1;
//        int star2 = 1;
//
//        while(star1 <= counter){
//            System.out.print("*");
//            star1++;
//        }
//        while (sp <= space){
//            System.out.print(" ");
//            sp++;
//        }
//        while (star2 <= counter){
//            System.out.print("*");
//            star2++;
//        }
//        System.out.println();
//        space-=2;
//        counter++;

//        System.out.println("Please enter grade and -1 to quit");
//        int grade = sc.nextInt();
//        int sum = 0;
//        int counter = 0;
//        while(grade!=-0){
//            System.out.println("Please enter grade or -1 to quit");
//            grade = sc.nextInt();
//            if(grade==-1){
//                break;
//            }
//            sum+=grade;
//            counter++;
//    }
//        double average = (double) sum / counter;
//        System.out.println("average: " + average);
//
//        int counter = 1;
//        while( counter<=4 ){
//            int traing1 = 0;
//            int triang2 = 0;
//
//            while (traing1 <=counter){
//                System.out.print("*");
//                traing1++;
//
//            }
//            counter++;
//        }

        System.out.println("please enter grade or -1 to quit");

        int grade = sc.nextInt();
        int freq5 = 0;
        int freq4 = 0;
        int freq3 = 0;
        int freq2 = 0;
        int freq1 = 0;
        int freq0 = 0;
        int sum = 0;
        int counter = 0;
        while (grade != -1){
            System.out.println("Please enter grade or -1 to quit");
            grade = sc.nextInt();
            if(grade == -1){
                break;
            }
            int gradeCheck = grade/10;
            if (gradeCheck <= 5){
                sum+=gradeCheck;
                counter++;
                if(gradeCheck==5){
                    freq5++;
                }
                if(gradeCheck==4){
                    freq4++;
                }
                if(gradeCheck==3){
                    freq3++;
                }
                if(gradeCheck==2){
                    freq2++;
                }
                if(gradeCheck==1){
                    freq1++;
                }
                if(gradeCheck==0){
                    freq0++;
                }
            }




        }
        double average = (double) sum / counter;
//        int maxFreq = freq0;
//        if(freq1 > freq0){
//            maxFreq= freq1;
//        }if(freq2 > maxFreq){
//            maxFreq = freq1;
//        }if(freq3 > maxFreq){
//            maxFreq=freq3;
//        }if(freq4>maxFreq){
//            maxFreq=freq4;
//        }
//        if(freq5 > maxFreq){
//            maxFreq = freq5;
//        }
        System.out.println("Average: " + average);
        System.out.println();
    }
}
