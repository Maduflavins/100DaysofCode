package flavins.com.codes;

import java.util.Scanner;

public class Sales {
    Scanner sc = new Scanner(System.in);

    public void calculateSales(){
        double sales[][] = new double [5][4];

        System.out.println("Please enter person number");
        int person = sc.nextInt();

        while(person!=-1){
            System.out.println("Please enter product number");
            int productNumber = sc.nextInt();
            System.out.println("Please enter amount sold");
            double amount = sc.nextDouble();

            if(person >= 1 && person < 5 && productNumber >= 1 && productNumber < 6 && amount >= 1){
                sales[productNumber-1][person-1]=+amount;
            }
            System.out.println("Please enter person number");
            person = sc.nextInt();
        }

        double salesPersonTotal [] = new double[4];

        for(int i=0; i<4; i++){
            salesPersonTotal[i]=0;
        }
        System.out.printf("%8s%14s%14s%14s%14s%10s\n",
                "Product", "Salesperson 1", "Salesperson 2","Salesperson 3",
                "Salesperson 4", "Total");


        //Printing a person's sales of a product
        for (int row = 0; row < 5; row ++) {
            double productTotal = 0.0;
            System.out.printf("%8d%n", (row + 1));

            for (int column = 0; column < 4; column++) {
                System.out.printf("%14.2f", sales[row][column]);
                productTotal += sales[row][column];
                salesPersonTotal[column] += sales[row][column];
            } //end for loop


            System.out.printf("8%s", "Total");

            for (int column = 0; column < 4; column++)
                System.out.printf("14.2%f", salesPersonTotal[column]);

            System.out.println();
        }
    }
}
