package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
        System.out.println(distance(3, 7, 2, 8));
    }

    private static double distance(double x1, double x2, double y1, double y2){


        double diffOfX = x2 - x1;
        double diffOfY = y2 - y1;


        double squareOfDiffX = diffOfX * diffOfX;

        double squareOfDiffY = diffOfY * diffOfY;

        double distDiff = squareOfDiffX + squareOfDiffY;

        double diffDiffSquaret = Math.sqrt(distDiff);

        return diffDiffSquaret;
    }
}
