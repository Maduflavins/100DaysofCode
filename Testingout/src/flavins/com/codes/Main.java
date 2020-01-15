package flavins.com.codes;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner((System.in));

    public static void main(String[] args) {
        System.out.println("Please enter radis: ");

        int radius = sc.nextInt();
        System.out.printf("%.2f",calculateArea(radius));
//	    Theatre theatre = new Theatre("Shangis", 12, 8);
//	    theatre.getSeats();

//        System.out.println(countIt(123));
    }


//    static int countIt(int something){
//        int c = 0;
//        String it = Integer.toString(something);
//        for(int i = 0; i < it.length(); i++){
//            c++;
//        }
//
//        return c;
//
//    }


    public static double calculateArea(int radius){
        double area = Math.PI *(double) (radius * radius);
        return area;


    }
}
