package flavins.com.codes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre terrys = new Theatre("Terrys", 8, 12);

	    List<Theatre.Seat>listCopy = new ArrayList<>(terrys.seats);
        System.out.println(listCopy);



    }

    public static void printList(List<Theatre.Seat>list){
        for(Theatre.Seat seat : list){
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=================================");
    }
}
