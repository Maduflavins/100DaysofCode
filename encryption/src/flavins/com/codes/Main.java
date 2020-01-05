package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	    int pw = 456789;

	    Password password = new Password(pw);
	    password.storePassword();
	    password.access(3456890);
	    password.access(456789);

		System.out.println(Math.pow(9.0, 0.5));
    }
}
