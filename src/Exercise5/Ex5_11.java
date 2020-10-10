package Exercise5;
/*  Program created by Uchechi
    Date:   08/10/2020
    
*/


import java.util.Scanner;

public class Ex5_11 {

    public static void main(String[] args) {
        int n, value, smallest  = 2000000000;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        n = input.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Enter value: ");
            value = input.nextInt();

            if(smallest > value) smallest = value;
        }
        System.out.println("Smallest number is " + smallest);
    }
}
