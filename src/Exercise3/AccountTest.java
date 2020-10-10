package Exercise3;
/*  Program created by Uchechi
    Date:   27/09/2020
    Time:   10:55 pm
*/


import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        String name = "";
        double balance = 0;
        Ex3_11 account1 = new Ex3_11(name, balance);
        Ex3_11 account2 = new Ex3_11(name, balance);

        Scanner input = new Scanner(System.in);

        //for account1

        System.out.println("Enter Account name for account1");
        name = input.nextLine();
        account1.setName(name);
        System.out.println("Enter Balance for Account1");
        balance = input.nextDouble();
        account1.setBalance(balance);
        System.out.printf("%s and balance %.2f \n", name , balance );

        name = input.nextLine(); //clear memory to take in account2 details

        //for account2
        System.out.println("Enter Account name for account2");
        name = input.nextLine();
        account2.setName(name);
        System.out.println("Enter Balance for Account2");
        balance = input.nextDouble();
        account2.setBalance(balance);
        System.out.printf("%s and balance %.2f %n", name , balance );

        //depost part
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding $%.2f to account1 balance%n%n",depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding $%.2f to account2 balance%n%n",depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter withdrawalal amount for account1: ");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("%nwithdrawaling $%.2f from account1 balance%n%n", withdrawalAmount);
        account1.withdrawal(withdrawalAmount);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter withdrawalal amount for account2: ");
        withdrawalAmount = input.nextDouble();
        System.out.printf("%nwithdrawaling $%.2f from account2 balance%n%n", withdrawalAmount);
        account2.withdrawal(withdrawalAmount);
        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

        input.close();





    }
}
