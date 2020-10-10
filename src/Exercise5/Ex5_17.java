package Exercise5;
/*  Program created by Uchechi
    Date:   09/10/2020
    
*/


import java.util.Scanner;

public class Ex5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int productnumber = 0;
        int quantity;
        double totalRetail = 0;


        System.out.println("1 - Product 1, $2.98");
        System.out.println("2 - Product 2, $4.50");
        System.out.println("3 - Product 3, $9.98");
        System.out.println("4 - Product 4, $4.49");
        System.out.println("5 - Product 5, $6.87");
        System.out.println("6 - Exit");
        System.out.print("Enter prodcut number: ");
        productnumber = input.nextInt();


        while (productnumber != 6) {
            System.out.print("Enter quantity: ");
            quantity = input.nextInt();
            while (quantity < 0){
                System.out.println("Wrong input. Try again");
                quantity = input.nextInt();
            }

            switch(productnumber){
                case 1:
                    totalRetail += quantity * 2.98;
                    System.out.printf("Total retail price for Product 1: %.2f%n", quantity * 2.98);
                    break;
                case 2:
                    totalRetail += quantity * 4.50;
                    System.out.printf("Total retail price for Product 2: %.2f%n", quantity * 4.50);
                    break;
                case 3:
                    totalRetail += quantity * 9.98;
                    System.out.printf("Total retail price for Product 3: %.2f%n", quantity * 9.98);
                    break;
                case 4:
                    totalRetail += quantity * 4.49;
                    System.out.printf("Total retail price for Product 4: %.2f%n", quantity * 4.49);
                    break;
                case 5:
                    totalRetail += quantity * 6.87;
                    System.out.printf("Total retail price for Product 5: %.2f%n", quantity *6.78);
                    break;
            } // end switch

            System.out.print("Enter product number: ");
            productnumber = input.nextInt();

        }  // end while loop

        System.out.printf("Total retail value: $%.2f%n", totalRetail);
    }
}
