package Exercise4;
/*  Program created by Uchechi
    Date:   08/10/2020
    
*/


import java.util.Scanner;

public class Ex4_39 {

    public static void main(String[] args) {

        double currPopulation;
        double rate;
        String year;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Year you want to start counting from: ");
        year = input.nextLine();
        System.out.println("Enter the Current population of the year: ");
        currPopulation = input.nextDouble();
        System.out.println("Enter the growth rate (in percentage) of the population");
        rate = input.nextDouble();

        System.out.printf("Starting in %s%n", year);
        System.out.println("Year\tPopulation\t\t\tIncrease");

        for(int i = 1; i < 76; i++){
            double increase = Math.pow(Math.E, rate*i);
            currPopulation *= increase;
            System.out.println(i + "\t" + currPopulation + "\t" + "\t" + increase);
        }
    }
}
