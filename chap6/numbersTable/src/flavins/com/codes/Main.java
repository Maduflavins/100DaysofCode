package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number" + " " + " " + " " +  "Binary Value" + " " + " " + " " +  "Octal Value" + " " + " " + " " + "Hexaddecimal Value");

        for(int i = 0; i <=200; i++){
           System.out.println(i + "\t\t\t" +  Integer.toBinaryString(i) + "\t\t\t" + Integer.toOctalString(i) + "\t\t\t"+ Integer.toHexString(i));
        }
    }
}
