package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	    if(args.length != 3){
            System.out.println("Error please re-enter the entire command");
        }else {
	        int arrayLength;
	        if(args[0] == " "){
	           arrayLength = 10;
            }else{
	            arrayLength = Integer.parseInt(args[0]);
            }

	        int [] array = new int[arrayLength];

	        int initialValue = Integer.parseInt(args[1]);
	        int increament = Integer.parseInt(args[2]);

	        for(int counter = 0; counter < array.length; counter++){
	            array[counter] = initialValue + increament * counter;

            }

            System.out.printf("%s%8s%n", "Index", "Value");

	        for(int counter = 0; counter < array.length; counter++){
                System.out.printf("%5d%8d%n", counter, array[counter]);
            }
        }
    }
}
