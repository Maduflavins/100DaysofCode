package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	    PackageData packageData = new PackageData();

	    //output String representation of packageData
        System.out.printf("After instantiation:%n%s%n", packageData);

        //change package access data in packageData object
        packageData.number = 77;
        packageData.string = "Goodbye";

        //output String representation of packageData
        System.out.printf("After changing values:%n%s%n", packageData);
    }
}

class PackageData{
    int number;
    String string;

    // consructor
    public PackageData(){
        number= 0;
        string = "Hello";
    }

    //return packageData object String representation

    public String toString(){
        return String.format("number: %d; string: %s", number, string);
    }
}
