package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	    int n = 10000;
	    int counter = 0;
	    for(int i = 1; i<=n; i++){
	        if(isPrime(i)){
	            counter++;
            }
        }
        System.out.println(counter);

    }


    public static boolean isPrime(int n){
        boolean flag = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        if(!flag){
            System.out.println(n + " is not  prime number");
            return false;
        }else{
            System.out.println(n + " is a prime number");
            return true;
        }
    }
}
