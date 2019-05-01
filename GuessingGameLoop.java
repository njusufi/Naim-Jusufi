import java.util.Random;
import java.util.Scanner;

public class GuessingGameLoop {
	
	public static void main(String[] args) {
		Random rand = new Random();
		final int MAX = 10; 
		final int MIN = 1;  
		int randomNumber =  rand.nextInt(MAX) + MIN;  
		int numberOfTries = 0;
		
		int userGuess = 0;                  
		boolean win = false;
		Scanner in = new Scanner(System.in); 
		
		while (win == false)
		{
			
			System.out.println("Please guess a random number between " + MIN + " and " + MAX);
			userGuess = in.nextInt();
			numberOfTries++;
			
			if (userGuess == randomNumber){
				System.out.println("Great Guess! You got it right!");
			} else {
				System.out.println("Sorry! That's not the number.");
			}
			
		}
		
			
	}
}
