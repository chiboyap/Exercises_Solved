package Exercise7;
/*  Program created by Uchechi
    Date:   09/10/2020
    
*/


public class ex7_16 {
    public static void main(String[] args) {

        if(args.length == 0)
            System.out.print("No arguments input.\n");
        else
        {
            double total = 0.0;

            for (String s : args)
            {
                double d = Double.parseDouble(s); // Turn argument into double value
                total += d;
            }
            System.out.printf("Sum: %.2f\n", total);
        }
    }
}
