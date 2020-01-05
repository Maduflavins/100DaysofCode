package flavins.com.codes;

public class Password {
    private static final int key = 748576362;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    public int encryptDecrypt(int password){
        return password^key;
    }

    public  final void storePassword(){
        System.out.println("storing password as " + this.encryptedPassword);
    }

    public boolean access(int password){
        if(encryptDecrypt(password)==this.encryptedPassword){
            System.out.println("Password correct");
            return true;
        }else {
            System.out.println("Wrong password");
            return false;
        }


    }
}
