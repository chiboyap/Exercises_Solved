package Exercise4;
/*  Program created by Uchechi
    Date:   08/10/2020
    Time:   03:10 pm
*/


import java.util.Scanner;

public class Ex4_36 {

    public static void main(String[] args) {

        int x, y, z;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first side: ");
        x = input.nextInt();
        while (x <= 0){
            System.out.print("Wront input. Enter first side: ");
            x = input.nextInt();
        }

        System.out.print("Enter second side: ");
        y = input.nextInt();
        while (y <= 0){
            System.out.print("Wront input. Enter second side: ");
            y = input.nextInt();
        }

        System.out.print("Enter third side: ");
        z = input.nextInt();
        while (z <= 0){
            System.out.print("Wront input. Enter third side: ");
            z = input.nextInt();
        }

        x = x * x;
        y = y * y;
        z = z * z;

        if (x + y == z){
            System.out.println("Right Triangle can be formed");
        }
        else if (x + z == y){
            System.out.println("Right Triangle can be formed");
        }
        else if (z + y == x){
            System.out.println("Right Triangle can be formed");
        }
        else{
            System.out.println("Right Triangle cannot be formed");
        }
        input.close();
    }
}
