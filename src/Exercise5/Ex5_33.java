package Exercise5;
/*  Program created by Uchechi
    Date:   09/10/2020
    
*/


public class Ex5_33 {
    public static void main(String[] args) {
        double users = 1; // Number of users in billions
        int month = 0;  // Number of months since October 2012

        System.out.println("Facebook had 1 billion users in October 2012.");

        for (users = 1; users <= 1.5;)
        {
            users = users * 1.04;
            month++;
        }

        System.out.printf("They will achieve 1.5 billion users in %d months%n", month);
    }
}
