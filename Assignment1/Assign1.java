import java.util.Scanner;	//import Scanner for user entry
import java.text.DecimalFormat; //import format to allow rounding to 2 decimal places
/**  Created:		Jan 29th, 2018
 *   Name:   		Bruce Tovee
 *   Section: 		CST8110_303
 *   Lab teacher:	Jason Mombourquette
 *   Purpose:		Allows the user to input marks and calculate their final marks
 *   CST8110 Assignment 1 due Feb 16th, 2018
 */
public class Assign1 {

	public static void main(String[] args) {
		
		// variables
		Scanner input = new Scanner (System.in); //creating scanner
		double lab=0, hybrid=0, test=0, exam=0, theory, prac, total; //initializing var for inputing marks
		DecimalFormat format = new DecimalFormat("#.##"); //format for displaying grades
		boolean loop = true; // creating boolean for loops to check if input is correct
		
		
		System.out.println("Welcome to the CST8101 Final Mark Calculator \n");
		
		//getting user input for marks
		System.out.print("Enter your Lab Assignments mark out of 25: ");
		while(loop) { //loop to make sure input is within certain parameters
			if( input.hasNextDouble()) { //check to see if input is a double
				lab = input.nextDouble(); // read input
				if(lab > 25) { // check to make sure input is under 25 
					System.out.print( "You must enter a number less than 25, please enter a number: " );
				}
				else if (lab < 0) { //check to make sure input is greater than 0
					System.out.print( "You must enter a number greater than 0, please enter a number: " );
				}
				else { //if input is a number less <=25 and >=0 then allow input and continue
					loop = false; //set loop to false so that you can contrinue to next input
					break;
				}
			}
			else { //if they dont put in a number ask again
				System.out.print( "You must enter a number, please enter a number: " );
				input.next();
			}
		}
		loop = true; //set boolean back to false to check next input
		
		System.out.print("Enter your Hybrid Activities / Quizzes mark out of 20: ");
		while(loop) {
			if( input.hasNextDouble()) { //check to see if input is a double
				hybrid = input.nextDouble(); // read input
				if(hybrid > 20) { // check to make sure input is under 20 
					System.out.print( "You must enter a number less than 20, please enter a number: " );
				}
				else if (hybrid < 0) { //check to make sure input is greater than 0
					System.out.print( "You must enter a number greater than 0, please enter a number: " );
				}
				else { //if input is a number less <=20 and >=0 then allow input and continue
					loop = false;  //set loop to false so that you can contrinue to next input
					break;
				}
			}
			else { //if they dont put in a number ask again
				System.out.print( "You must enter a number, please enter a number: " );
				input.next();
			}
		}
		loop = true; //set boolean back to false to check next input
		
		System.out.print("Enter your Test mark out of 25: ");
		while(loop) {
			if( input.hasNextDouble()) { //check to see if input is a double
				test = input.nextDouble(); // read input
				if(test > 25) { // check to make sure input is under 25 
					System.out.print( "You must enter a number less than 25, please enter a number: " );
				}
				else if (test < 0) { //check to make sure input is greater than 0
					System.out.print( "You must enter a number greater than 0, please enter a number: " );
				}
				else { //if input is a number less <=25 and >=0 then allow input and continue
					loop = false; //set loop to false so that you can contrinue to next input
					break;
				}
			}
			else { //if they dont put in a number ask again
				System.out.print( "You must enter a number, please enter a number: " );
				input.next();
			}
		}
		loop = true; //set boolean back to false to check next input
		
		System.out.print("Enter your Final Assessment (Exam) mark out of 30: ");
		while(loop) {
			if( input.hasNextDouble()) { //check to see if input is a double
				exam = input.nextDouble(); // read input
				if(exam > 30) { // check to make sure input is under 25 
					System.out.print( "You must enter a number less than 30, please enter a number: " );
				}
				else if (exam < 0) { //check to make sure input is greater than 0
					System.out.print( "You must enter a number greater than 0, please enter a number: " );
				}
				else { //if input is a number less <=30 and >=0 then allow input and continue
					loop = false; //set loop to false so that you can contrinue to next input
					break;
				}
			}
			else { //if they dont put in a number ask again
				System.out.print( "You must enter a number, please enter a number: " );
				input.next();
			}
		}
		
		
		//calculating final marks
		theory = ((test+exam)/55)*100;
		prac = ((hybrid+lab)/45)*100;
		total = test+exam+hybrid+lab;
		
			
		//displaying final grades
		System.out.println("Theory grade: "+format.format(theory)+"%");
		System.out.println("Practical grade: "+format.format(prac)+"%");
		System.out.println("Final grade: "+format.format(total)+"%");

		input.close(); // close scanner
	}

}
