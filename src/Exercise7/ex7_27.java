package Exercise7;
/*  Program created by Uchechi
    Date:   09/10/2020
    
*/


public class ex7_27 {
    public static void main(String[] args) {

        boolean[] prime = new boolean[1000];

        // Set all values of array to true
        for (int i = 0; i < prime.length; i++)
            prime[i] = true;

        for (int i = 2; i < prime.length; i++)
        {
            // If the element is true
            if(prime[i])
            {
                //Iterate through the array and set all multiples to false
                for (int j = i;j * i < prime.length; j++)
                    prime[i * j] = false;
            }
        }

        // Display all prime numbers
        for (int i = 2; i < prime.length; i++)
        {
            if (prime[i])
                System.out.printf("%d%n", i);

        }
    }}
