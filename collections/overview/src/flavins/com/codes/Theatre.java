package flavins.com.codes;

import java.lang.reflect.Array;
import java.util.*;

public class Theatre {
    private final String theatreName;
    public  List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);

        for(char row = 'A'; row <= lastRow; row++){
            for(int seatNum=1; seatNum <= seatPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        //java default binary search source code
        int low = 0;
        int high = seats.size()-1;

        while (low<=high){
            System.out.println(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if(cmp < 0){
                low = mid + 1;

            }else if(cmp > 0){
                low = mid + 1;
            }else{
                return seats.get(mid).reserve();
            }
        }
        System.out.println("Thers is no neat " + seatNumber);
        return  false;


//        Seat requestedSeat = new Seat(seatNumber);
//        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
//        if(foundSeat >= 0){
//            return seats.get(foundSeat).reserve();
//        }else{
//            System.out.println("This seat number " + seatNumber + " is not available");
//            return false;
//        }

//        for(Seat seat: seats){
//            if(seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if(requestedSeat == null){
//            System.out.println("There is no seat " + seatNumber);
//        }
//        return requestedSeat.reserve();
    }

    public void getSeats(){
        for(Seat seat : seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareTo(seat.getSeatNumber());
        }

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve(){
            if(!this.reserved){
                reserved = true;
                System.out.println("Seat number: " + seatNumber + " now reserved");
                return true;
            }else{
                return false;
            }

        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean cancel(){
            if(this.reserved) {
                this.reserved = false;
                System.out.println("This seat number have been canceled");
                return true;
            }else{
                return false;
            }
        }
    }


}
