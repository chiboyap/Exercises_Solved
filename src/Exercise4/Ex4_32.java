package Exercise4;
/*  Program created by Uchechi
    Date:   08/10/2020
    Time:   02:20 pm
*/


public class Ex4_32 {

    public static void main(String[] args) {

        int counter = 0; // Used for while loop
        int counter2 = 0; // Used for each line
        while (counter < 8)
        {
            if (counter % 2 == 1)
                System.out.print(" ");

            counter2 = 0; // Resets counter2

            while (counter2 < 8)
            {
                System.out.print("*");
                System.out.print(" ");
                counter2++;
            }
            System.out.println();
            counter++;
        }
    }
}
