package flavins.com.codes;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<Seat>();

    public Theatre(String theatreName, int numRows, int seatPerRows) {
        this.theatreName = theatreName;

        int lastRows = 'A' + (numRows - 1);

        for(char row = 'A'; row<=lastRows; row++){
            for(int seatNum = 1; seatNum<=seatPerRows; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestSeated = null;
        for(Seat seat : seats){
            if(seat.getSeatNumber().equals(seatNumber)){
                requestSeated = seat;
                break;
            }
            if(requestSeated == null){
                System.out.println("There is no seat " + seatNumber);
                return false;
            }

        }
        return requestSeated.reserve();
    }
    //for testing
    public void getSeats(){
        for(Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }

    }

    private class Seat{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            }else{
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Rseervation of seat cancelled  for seat number" + seatNumber );
                return true;
            }else{
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
