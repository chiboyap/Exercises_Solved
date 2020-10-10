package Exercise5;
/*  Program created by Uchechi
    Date:   09/10/2020
    
*/


public class Ex5_18 {
    public static void main(String[] args) {
        int amount;
        int principal = 1000;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for (int year = 1; year <= 10; ++year){
            amount = (int)(Math.round(principal * Math.pow(1.0 + rate, year) * 100));
            int cents = amount % 100;
            int dollars = amount / 100;
            System.out.printf("%4d%,20d.%d%n", year, dollars, cents);
        }
    }
}
