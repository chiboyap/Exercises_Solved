package Exercise5;
/*  Program created by Uchechi
    Date:   08/10/2020
    
*/


public class Ex5_14 {
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++){
            for (rate = 0.05; rate <= 0.09; rate += 0.01) {
                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
        }
    }
}
