package Exercise3;
/*  Program created by Uchechi
    Date:   29/09/2020
    Time:   03:55 pm
*/


import java.util.Scanner;

public class Ex3_12InvoiceTest {

//first create a method to display result (showInvoice)
    private static void showInvoice(Ex3_12 invoice){
        System.out.println("Invoice #" + invoice.getNumber());
        System.out.println("Description: " + invoice.getDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price: $" + invoice.getPrice());
        System.out.printf("Invoice ammount : $%.2f%n" , invoice.getInvoiceAmount());
    }

    public static void main(String[] args) {

        //create and initialize all variables to used
        String number = "";
        String description = "";
        int quantity = 0;
        double price = 0.0;

//        call class Ex3_12
        Ex3_12 invoice = new Ex3_12(number, description, quantity, price);
//        Ex3_12 invoice = new Ex3_12("123456789", "This is the First Print", 10, 5.99); //first display,
//        showInvoice(invoice);
        Scanner input = new Scanner(System.in);

        System.out.print("\nSet item number: ");
        number = input.nextLine();
        invoice.setNumber(number);

        System.out.print("Set item description: ");
        description = input.nextLine();
        invoice.setDescription(description);

        System.out.print("Set item quantity: ");
        quantity = input.nextInt();
        invoice.setQuantity(quantity);

        System.out.print("Set item price: $");
        price = input.nextDouble();
        invoice.setPrice(price);

        System.out.println();
        showInvoice(invoice);
        input.close(); // .close is used to stop scanner from collecting inputs
    }

}
