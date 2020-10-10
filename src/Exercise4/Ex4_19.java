package Exercise4;
/*  Program created by Uchechi
    Date:   04/10/2020
    Time:   04:20 pm
*/


import java.util.Scanner;

public class Ex4_19 {

    public static void main(String[] args) {

        double value, total = 0;
        int counter = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of item sold or -1 to exit: ");
        value = input.nextDouble();

        while(value != -1){
            total += value;
            System.out.print("Enter value of item sold or -1 to exit: ");
            value = input.nextDouble();
            counter++; // keeps record of number of items recorded
        }
        System.out.printf("%n%d item(s) sold for $%.2f%nEarnings: $%.2f", counter, total,(200+(0.09*total)));

    }
}
