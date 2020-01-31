package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DeckOfCards mydeckofcards = new DeckOfCards();

        mydeckofcards.shuffle();

        for(int i = 1; i <= 52; i++){
            System.out.printf("%-19s", mydeckofcards.dealCard());

            if(i % 4==0){
                System.out.println();
            }
        }
    }
}
