package Exercise3;
/*  Program created by Uchechi
    Date:   01/10/2020
    Time:   07:49 pm
*/


import java.util.Scanner;

public class Ex3_14DateTest {
    public static void main(String[] args) {
        int day = 0;
        int month = 0;
        int year = 0;

        Ex3_14 date = new Ex3_14(day, month, year);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Day: ");
        day = input.nextInt();
        date.setDay(day);

        System.out.println("Enter month: ");
        month = input.nextInt();
        date.setMonth(month);

        System.out.println("Enter Year: ");
        year = input.nextInt();
        date.setYear(year);

        System.out.println("The Date is: ");
        date.dateDisplay();
    }


}
