import java.util.Random;
import java.util.Scanner;

public class GuesingGameLoooop {
	public static void main(String[] args) {
		Random rand = new Random(); 
		final int MAX = 10;
		final int MIN = 1;
		int randomNumber =  rand.nextInt(MAX) + MIN;   
		int num;
		int userGuess = 0;                   
		Scanner in = new Scanner(System.in); 
		num = (int) (Math.random() * 100) + 1;

	      do
	      {
	    	  System.out.println("Please guess a random number between " + MIN + " and " + MAX);
			userGuess = in.nextInt();
			
			if (userGuess == randomNumber){
				System.out.println("Great Guess! You got it right!");
			} else {
				System.out.println("Sorry! That's not the number.");
			}
			
			
	}while (userGuess != num);
	}
}
