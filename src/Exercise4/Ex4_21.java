package Exercise4;
/*  Program created by Uchechi
    Date:   04/10/2020
    Time:   07:55 pm
*/


import java.util.Scanner;

public class Ex4_21 {

    public static void main(String[] args) {

        int counter = 0;
        int number;
        int largest = 0;
        Scanner input = new Scanner(System.in);

        while(counter < 10){
            System.out.print("Enter number: ");
            number = input.nextInt();
            if(number > largest)
                largest = number;
            counter++;
        }
        System.out.println("\nLargest number is " + largest + ". Goodbye!");
    }
}
