package flavins.com.codes;


import java.math.BigDecimal;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05); //interest rate

        //display header
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        //calculate amoount on deposit for each of ten years

        for(int year = 1; year <= 10; year++){
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));

            //display the year and the amount

            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }
    }
}
