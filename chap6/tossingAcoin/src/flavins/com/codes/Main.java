package flavins.com.codes;

import java.security.SecureRandom;

public class Main {
    private static SecureRandom randomNumber = new SecureRandom();

    private enum Coin{ HEADS, TAILS};
    private static int coin = 1 + randomNumber.nextInt(2);

    private static Coin flip(){
        if(coin == 1){
            return Coin.HEADS;
        }else{
            return  Coin.TAILS;
        }
    }

    public static void main(String[] args) {
        tossCoin(10);
	// write your code here
    }

    private static void tossCoin(int n){
        int total_number_of_toss = 0;
        int number_of_tails = 0;
        int number_of_heads = 0;
        for(int i = 0; i <=  n; i++){
            Coin status = flip();
            total_number_of_toss++;
            if(status == Coin.HEADS){
                number_of_heads++;
            }else{
                number_of_tails++;
            }

        }
        System.out.println("Total number of toss = " + total_number_of_toss + " Heads = " + number_of_heads + " Tails = " + number_of_tails);
    }

}
