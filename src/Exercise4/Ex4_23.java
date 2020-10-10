package Exercise4;
/*  Program created by Uchechi
    Date:   05/10/2020
    Time:   04:04 pm
*/


import java.util.Scanner;

public class Ex4_23 {

    public static void main(String[] args) {

        int counter = 0, number, largest = 0, secondLargest = 0;
        Scanner input = new Scanner(System.in);

        while(counter < 10){
            System.out.print("Enter number: ");
            number = input.nextInt();
            if(number > largest){
                secondLargest = largest;
                largest = number;
            }
            counter++;
        }
        System.out.println("\nLargest number is " + largest + " and the second largest is " + secondLargest);
    }
}
