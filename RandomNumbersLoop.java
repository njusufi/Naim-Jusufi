import java.util.Random;

public class RandomNumbersLoop {
	public static void main(String[] args) {
		Random rand = new Random();
		final int MAX = 10;
		final int MIN = 1;
		
			int randomNumber = 0;
			for (int i=0; i < MAX; i++)
				
				{
				
				randomNumber = rand.nextInt(MAX) + MIN;
				
				}
			
			System.out.println(randomNumber);
			}
}


