package flavins.com.codes;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear>gears;
    private int maxGear;
    private int currentGear = 0;

    public GearBox(int maxGear) {
        this.maxGear = maxGear;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }


    public  class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double rate) {
            this.gearNumber = gearNumber;
            this.ratio = rate;
        }

        public double driveSpeed(int revs){
            return revs * this.ratio;
        }


    }

}
