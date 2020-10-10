package Exercise5;
/*  Program created by Uchechi
    Date:   09/10/2020
    
*/


public class Ex5_24 {
    public static void main(String[] args) {
        int n = 5;
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            space--;
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.print("\n");
        }
        space = 1;
        for (int i = 1; i <= n - 1; i++){
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            space++;
            for (int j = 1; j <= 2*(n - i)-1; j++)
                System.out.print("*");

            System.out.println(" ");
        }
    }
}
