package Exercise4;
/*  Program created by Uchechi
    Date:   08/10/2020
    Time:   01:39 pm
*/


import java.util.Scanner;

public class Ex4_31 {

    public static void main(String[] args) {

        int binary, decimal = 0, multiplier = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary nubmer: ");
        binary = input.nextInt();
        while(binary != 0){
            int rightMost = binary % 10; // int rightMost is the resulting remainder. NOTE: the binary should be more than ten digits

            binary /= 10; // performs division on the binary taking only the integer part for the next loop
            decimal += rightMost * multiplier; // decimals is now the result of the rightMost * multiplier
            multiplier *= 2; // multiplier becomes multiplier * 2and looped again
        }
        System.out.println("Decimal Equivalent: " + decimal);

    }
}
