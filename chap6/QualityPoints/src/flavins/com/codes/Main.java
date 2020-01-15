package flavins.com.codes;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("your quality point is: " + qualityPoints());
    }

    public static int qualityPoints(){
        System.out.printf("Please enter average grade");
        int grade = sc.nextInt();
        int gradeCheck = grade / 10;
        int gradePoint = -1;

        if(gradeCheck == 9 || gradeCheck==10){
            gradePoint = 4;
        }else if(gradeCheck == 8){
            gradePoint = 3;
        }else if(gradeCheck == 7){
            gradePoint = 2;
        }else if(gradeCheck==6){
            gradePoint=1;
        }else {
            gradePoint = 0;
        }

        return gradePoint;
    }
}
