package Exercise7;
/*  Program created by Uchechi
    Date:   09/10/2020
    
*/


import java.util.Random;

public class ex7_17 {
    public static void main (String[] args){
        Random rand = new Random();
        int dice1;
        int dice2;
        int[] frequencies = new int[13];
        for(int i = 0; i < 36000000; i++){
            dice1 = rand.nextInt(6) + 1;
            dice2 = rand.nextInt(6) + 1;

            int sum = dice1 + dice2;
            ++frequencies[sum];
        }
        System.out.println("Sum" + "\t" + "Frequency");
        for(int i = 2; i < frequencies.length; i++){
            System.out.println(i + "\t" + frequencies[i]);
        }
    }
}
