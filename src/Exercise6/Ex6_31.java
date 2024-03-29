package Exercise6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex6_31 {

	public static void main(String[] args) {

		SecureRandom random = new SecureRandom();
		Scanner input = new Scanner(System.in);
		int number, guess, choice = 1, count = 0;
		
		while(choice == 1){
			number = 1 + random.nextInt(1001);
			System.out.print("\nGuess a number between 1 and 1000: ");
			guess = input.nextInt();
			while(guess != number){
				if(guess > number){
					System.out.print("Too high. Try again: ");
					guess = input.nextInt();
				}
				else{
					System.out.print("Too low. Try again: ");
					guess = input.nextInt();
				}
				count++;
			}
			System.out.println("Congratulations. You guessed the number in " + count + " guesses!");
			if(count < 10)
				System.out.println("Either you know the secret or you got lucky!");
			else if(count > 10)
				System.out.println("You should be able to do better!");
			else
				System.out.println("Aha! You know the secret!");
			
			System.out.print("Enter 1 to play again or anything else to quit:");
			choice = input.nextInt();
		}
		System.out.println("Goodbye!");
		input.close();
	}

}
