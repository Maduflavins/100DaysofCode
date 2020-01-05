package flavins.com.codes;


import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger currentPopulation = new BigInteger("7800000000");
        int year = 0;
        BigInteger rate = BigInteger.valueOf(83776000);
        BigInteger newPopulation = currentPopulation.add(rate);
        BigInteger numericalIncrease = newPopulation.subtract(currentPopulation);
        System.out.printf("%s%40s%40s%n", "Year", "End of Year Population", "Nummerical Increase");
        for(int i = 0; i<=74; i++){
            year++;
            newPopulation=newPopulation.add(newPopulation);
            if(newPopulation == currentPopulation.add(currentPopulation)){
                System.out.printf("at %d% the %o is double of the current population", year, newPopulation);
            }
            numericalIncrease = numericalIncrease.add(numericalIncrease);
            System.out.printf("%d%40o%40o%n",year,newPopulation,numericalIncrease);

        }




    }
}
