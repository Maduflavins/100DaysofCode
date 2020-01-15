package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
        //System.out.println(hghestestDivisor(20));
        System.out.println(gcd(10, 20));
    }


    public static int gcd(int a, int b){
//        int agcd = hghestestDivisor(a);
//        int bgcd = hghestestDivisor(b);
        int highestValue = Math.max(a, b);
        int highestGcd = -2_147_483_648;
        for(int i = 1; i <= highestValue; i++){
            if((a% i == 0 )&& (b% i == 0 )&& (i > highestGcd)){
                highestGcd = i;
            }
        }
        return highestGcd;

    }

}
