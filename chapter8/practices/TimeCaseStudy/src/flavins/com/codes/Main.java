package flavins.com.codes;

import java.sql.Time;

public class Main {

    public static void main(String[] args) {
        //create and intialize a Time1 object

	    Time1 time = new Time1(); // invokes Tiime1 constructor

        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21, 34);
        Time2 t4 = new Time2(12, 25, 42);
        Time2 t5 = new Time2();

        System.out.println("Constructred with: ");
        displayTimeT2("t1: all default arguments", t1);
        displayTimeT2("t2: hour specified; default minute and second", t2);
        displayTimeT2("t3: hour and minute specified; default second", t3);
        displayTimeT2("t4: hour, minute and second specified", t4);
        displayTimeT2("t5: Time2 object t4 specified", t5);

        //Attempt to initializw t6 with invalid values

        try{
            Time2 t6 = new Time2(27, 74, 99);
        }catch (IllegalArgumentException e){
            System.out.printf("%nException while initializing t6: %s%n,", e.getMessage());
        }
        // displays a Time2 object in 2 object in 24-hour and 2-hour formats
        //output string representations of the time

        displayTime("After time object is created", time);
        System.out.println();

        //change time and output updated time
        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();

        //attempt to set time with invalid values

        try{
            time.setTime(99, 99, 99); // all values out of range


        }catch(IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        //display time after attempt to set invalid values
        displayTime("After calling setTime with invalid values", time);


    }
    // displays a Time1 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time1 t){
        System.out.printf("%s%nUniversal time: %s^nStandard time: %s%n", header, t.toUniversalString(), t.toString());
    }

    private static void displayTimeT2(String header, Time2 t){
        System.out.printf("%s%n %s%n %s%n",
                header, t.toUniversalString(), t.toString());
    }


}
