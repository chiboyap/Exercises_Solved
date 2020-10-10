package Exercise4;
/*  Program created by Uchechi
    Date:   08/10/2020
    Time:   03:04 pm
*/


import java.util.Scanner;

public class Ex4_35 {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Enter third number: ");
        num3 = input.nextInt();

        if (num1 + num2 <= num3)
            System.out.println("These numbers cannot form a triangle.");
        else if (num1 + num3 <= num2)
            System.out.println("These numbers cannot form a trinagle.");
        else if (num2 + num3 <= num1)
            System.out.println("These numbers cannot form a triangle.");
        else
            System.out.println("These numbers can form a triangle.");
    }
}
