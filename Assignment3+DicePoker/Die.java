import java.util.Random;
public class Die {
	private int dieValue;// holds the value of the ONE die
	private Random randomNumbers; // common random number generator
	
	public Die() { // default constructor
		randomNumbers = new Random();
	}
	public void rollDie() { // Generate a random value for die
		dieValue = randomNumbers.nextInt (6) + 1; 
	}
	public void displayDie() { // Displays the value of die
		System.out.println(dieValue);
	}
	public int getValue() { // Returns value of die
		return dieValue;
	}
}
