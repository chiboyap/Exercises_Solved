package Exercise5;
/*  Program created by Uchechi
    Date:   08/10/2020
    
*/


public class Ex5_13 {

    public static void main(String[] args) {
        long factorial = 1;
        int counter = 20;

        while (counter > 1){
            factorial *= counter;
            counter--;
        }
        System.out.printf("20! = %d%n", factorial);
    }
}
