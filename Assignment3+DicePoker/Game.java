import java.util.Scanner;
public class Game {
	private int potAmount; // holds the value of the pot
	private int betAmount; // holds the bet value
	private String betType;  // holds the bet type
	private Scanner input; // common scanner

	public Game() {// default (no-arg) constructor
		potAmount = 100; // pot starting value is 100
		betAmount = 1;
		betType = "";
		input = new Scanner(System.in);
	}//end constructor 

	public void getBetFromUser() { // prompts the user to enter a valid bet amount and type
		
		boolean error = true;// used in loops to check for input error
		
		System.out.println("Your current pot is " + potAmount); //displaying pot amount

		System.out.print("Enter your bet amount: "); //asking for bet amount
		while(error) {//making sure betAmount is valid
			if(input.hasNextInt()) { //checking to see if input is an int
				betAmount = input.nextInt();
		
				if(betAmount < 0 || betAmount > potAmount) {//checking to make sure bet is >0 and <80
					System.out.print("Error - cannot bet less than 0 or more than " + potAmount + "...Enter your bet amount:");
				}	
				else {//if betAmount is valid
					potAmount -= betAmount;//removing betAmount from user's pot
					error = false;
					break;
				}	
			}
			else { //if user didnt enter an int
				System.out.print("Please enter a valid integer for your bet: ");
				input.next();
			}	
		}//end while
		
		if(betAmount == 0) {
			System.out.println("You end the game with pot of " + potAmount);
		}

		else { //only display if user wishes to continue
			error = true;
			while(error) {
				System.out.print("Enter your bet type: ");//asking for bet type
				if(input.hasNext()) { //checking to see if input is an int
					betType = input.next();	
			
					//checking to make sure betType is valid
					if(betType.equalsIgnoreCase("high") || betType.equalsIgnoreCase("low") || betType.equalsIgnoreCase("even") || betType.equalsIgnoreCase("odd")) {
						error = false;
						break;
					}	
					else {//if betType isnt valid
						System.out.print("Please enter odd, even, high, or low ....Enter your bet type: ");	
					}	
				}
			}//end while
		}
		
	}//end getBetFromUser

	public void playGame() { // logic for the game
		
		int total;// var to store the total value of the 3 die rolls
		
		Die[] DieAr = new Die[3];	//creating an array of die for the game
		for( int i=0; i<=2; i++ ) {
			DieAr[i] = new Die();
		}
		
		boolean play = true;// boolean for the gameplay loop

		while(play) { // gameplay loop
			this.getBetFromUser();//asking for input from user
			if(betAmount == 0) {
				play = false;
				break;
			}
			
			total = 0; //reset total for new round
			for( int i=0; i<=2; i++ ) {	//rolling die
				DieAr[i].rollDie();	
				total += DieAr[i].getValue();
			}

			System.out.println("Your dies are: " + DieAr[0].getValue() + " and " + DieAr[1].getValue() +" and " + DieAr[2].getValue()); //displaying rolls
			
			//checking to see if user won or lost
			if(betType.equalsIgnoreCase("high")) {
				if(total >= 9) { //win
					System.out.println("You WIN....double your bet\n");
					potAmount += (betAmount * 2);
				}
				else { //lose
					System.out.println("You LOSE....your bet\n");
				}
			}
			else if(betType.equalsIgnoreCase("low")) {
				if(total < 9) { //win
					System.out.println("You WIN....double your bet\n");
					potAmount += (betAmount * 2);
				}
				else { //lose
					System.out.println("You LOSE....your bet\n");
				}
			}
			else if(betType.equalsIgnoreCase("even")) {
				if((total % 2) == 0) { //win
					System.out.println("You WIN....double your bet\n");
					potAmount += (betAmount * 2);
				}
				else { //lose
					System.out.println("You LOSE....your bet\n");
				}
			}
			else if(betType.equalsIgnoreCase("odd")) {
				if((total % 2) != 0) { //win
					System.out.println("You WIN....double your bet\n");
					potAmount += (betAmount * 2);
				}
				else { //lose
					System.out.println("You LOSE....your bet\n");
				}
			}
			if(potAmount == 0) {
				System.out.println("You BUST - your pot is empty, better luck next time");
				play = false;
				break;
				
			}
			
		}//end while
		
		input.close();
	}//end playGame()
	
}
