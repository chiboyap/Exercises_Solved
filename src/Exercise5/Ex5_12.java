package Exercise5;
/*  Program created by Uchechi
    Date:   08/10/2020
    
*/


public class Ex5_12 {

    public static void main(String[] args) {
        int product = 1;
        int i = 1;

        while (i < 16){
            product *= i;
            i += 2;
        }
        System.out.printf("The Product of Odd numbers from 1 to 15 = %d%n", product);
    }
}
