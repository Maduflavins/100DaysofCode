package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	    GearBox Maclearn = new GearBox(6);
	   GearBox.Gear first = Maclearn.new Gear(6, 10.9);
        System.out.println("first drive speed " + first.driveSpeed(1000));
    }
}
