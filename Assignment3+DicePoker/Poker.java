import java.util.Scanner;
import java.util.Arrays;
public class Poker {
	private int potAmount; // holds the value of the pot
	private int betAmount; // holds the bet value
	private Scanner input; // common scanner
	public Poker() {// default (no-arg) constructor
		potAmount = 100; // pot starting value is 100
		betAmount = 1;
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


	}//end getBetFromUser

	public void playGame() { // logic for the game

		String reroll;

		Die[] dieAr = new Die[5];	//creating an array of die for the game
		for( int i=0; i<=4; i++ ) {
			dieAr[i] = new Die();
		}

		boolean play = true;// boolean for the gameplay loop

		while(play) { // gameplay loop
			this.getBetFromUser();//asking for input from user
			if(betAmount == 0) {
				play = false;
				break;
			}
			System.out.print("Your dies are: ");
			for( int i=0; i<=4; i++ ) {	//rolling die
				dieAr[i].rollDie();	
				System.out.print(dieAr[i].getValue() + " "); //displaying rolls
			}
			System.out.print("\n");

			System.out.println("Which dice would you like to keep(enter y or n 6 times ex: yynyny)");
			reroll = input.next();
			for(int p=0; p<=4; p++) {	//checking which dice should be rerolled
				if(reroll.charAt(p) == 'n' || reroll.charAt(p) == 'n') {
					dieAr[p].rollDie();
				}
			}//end for

			System.out.print("Your dies are: ");
			for( int o=0; o<=4; o++ ) {	
				System.out.print(dieAr[o].getValue() + " "); //displaying rolls
			}
			System.out.print("\n");

			//array to keep track of the amount of each face value
			int[] values = new int[6];
			for(int g=0; g<=4; g++) {
				values[g] = 0;
			}
			//boolean to check for straights
			boolean highStraight = true;
			boolean lowStraight = true;
			//boolean to check for pairs,trios, quads, fives
			boolean firstPair = false;
			boolean secondPair = false;
			boolean triple = false;
			boolean quad = false;
			boolean five = false;
			//array to sort die values to check for straights
			int[] sortedDies = new int[5];

			for(int l=0; l<=4; l++) {//loop to count the amount of each number on the die
				switch(dieAr[l].getValue()) {
				case 1:
					values[0]++;
					break;
				case 2:
					values[1]++;
					break;
				case 3:
					values[2]++;
					break;
				case 4:
					values[3]++;
					break;
				case 5:
					values[4]++;
					break;
				case 6:
					values[5]++;
					break;
				}
			}

			for(int k=0; k<=4; k++) { // putting the die values into a int array to allow sorting for straight checking 
				sortedDies[k] = dieAr[k].getValue();
			}
			Arrays.sort(sortedDies);//sorting int array


			for(int j=0; j<=4; j++) {

				if(sortedDies[j] != (j+2) ) {  //checking if rolls were a HighStraight
					highStraight = false;
				}

				if(sortedDies[j] != (j+1) ) { //checking if rolls were a lowStraight
					lowStraight = false;
				}
			}//end for
			for(int f=0; f<=5; f++) {
				if(values[f] == 2){//checking for pair

					if(values[f] == 2 && firstPair == true) { //checking for two pairs
						secondPair = true;
					}
					firstPair = true;
				}
				if(values[f] == 3) {//checking for triple
					triple = true;
				}
				if(values[f] == 5) {//checking for fives
					five = true;
				}
				else if(values[f] == 4) { //checking for quad
					quad = true;
				}
			}//end for

			if(five) { //five of a kind
				System.out.println("5 of a kind!");
				potAmount += betAmount*120; 
			}
			else if(quad) { //four of a kind
				System.out.println("4 of a kind!");
				potAmount += betAmount*60; 
			}
			else if(triple && firstPair) { //full house
				System.out.println("Full House!");
				potAmount += betAmount*45; 
			}
			else if(highStraight) {// highstraight
				System.out.println("High Straight!");
				potAmount += betAmount*30; 
			}
			else if(lowStraight) {//low straight
				System.out.println("Low Straight!");
				potAmount += betAmount*20; 
			}
			else if(triple) {// 3 of a kind
				System.out.println("3 of a kind!");
				potAmount += betAmount*10; 
			}
			else if(firstPair && secondPair) {//pair
				System.out.println("Two Pair");
				potAmount += betAmount*5; 
			}
			else if(firstPair) {//pair
				System.out.println("Pair");
				potAmount += betAmount; 
			}
			else {
				System.out.println("You Lose...");
			}

			System.out.print("\n");
		}//end while

		input.close();
	}//end playGame

}//end class
