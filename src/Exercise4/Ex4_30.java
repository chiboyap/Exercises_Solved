package Exercise4;
/*  Program created by Uchechi
    Date:   08/10/2020
    Time:   05:58 am
*/


import java.util.Scanner;

public class Ex4_30 {

    public static void main (String []args){

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5-digit number: ");
        number = input.nextInt();

        while(number < 10000 || number > 99999){
            System.out.print("Wrong input. Enter 5-digit number: ");
            number = input.nextInt();
        }
        int digit5 = number % 10;
        number /= 10;
        int digit4 = number % 10;
        number /= 100;
        int digit2 = number % 10;
        number /= 10;
        int digit1 = number % 10;

        if(digit5 == digit1 && digit4 == digit2)
            System.out.println("Palindrome!");
        else
            System.out.println("Not a palindrome");
    }
}
