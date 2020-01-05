package flavins.com.codes;

import java.security.SecureRandom;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Roll a dice 6 times
//        SecureRandom randomNumbers = new SecureRandom();
//
//        for(int counter = 1; counter <=20; counter++){
//            int face = 1 + randomNumbers.nextInt(6);
//            System.out.printf("%d ", face);
//            if(counter % 5 == 0){
//                System.out.print();
//            }
       // }

        // Roll a Dice 60_000_000 times and get the frequency of numbers/faces that appeared.

        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequecy6 = 0;

        for(int counter = 1; counter<=60_000_000; counter++){
            int face = 1 + randomNumbers.nextInt(6);

            switch (face){
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequecy6;
                    break;
            }
        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                frequency1, frequency2, frequency3, frequency4, frequency5, frequecy6);
    }
}
