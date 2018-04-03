import java.util.Scanner;
public class Assign3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to play: ");
		System.out.println("1: Dice Poker");
		System.out.println("2: High/Low/Even/Odd ");
		System.out.print("Please enter 1 or 2: ");
		int y = input.nextInt();
		if(y == 1) {
			Poker x = new Poker();
			x.playGame();
		}
		if(y == 2) {
			Game z = new Game();
			z.playGame();
		}

		input.close();
	}

}
