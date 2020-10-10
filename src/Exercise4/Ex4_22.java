package Exercise4;
/*  Program created by Uchechi
    Date:   04/10/2020
    Time:   08:10 pm
*/


public class Ex4_22 {

    public static void main(String[] args) {

        int counter = 1;
        System.out.println("N\t10*N\t100*N\t1000*N\n");
        while (counter < 6) {
            System.out.println(counter + "\t" + counter * 10 + "\t" + "\t" + counter * 100 + "\t" + "\t" + counter * 1000);
            counter++;
        }
    }
}