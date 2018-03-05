import java.text.DecimalFormat;
import java.util.Scanner;

public class MarkCalculator {
	// variables
	Scanner input = new Scanner (System.in); //creating scanner
	private double lab=0, hybrid=0, test=0, finalExam=0, theory, practical, finalGrade; //initializing var for inputing marks
	DecimalFormat format = new DecimalFormat("#.##"); //format for displaying grades
	boolean loop = true; // creating boolean for loops to check if input is correct
			
	public static void main(String[] args) {
		
		MarkCalculator marks =new MarkCalculator();
		marks.getValues();
		marks.calculateGrades();
		marks.displayGrades();
	}
	
	public void getValues() {
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
				finalExam = input.nextDouble(); // read input
				if(finalExam > 30) { // check to make sure input is under 25 
					System.out.print( "You must enter a number less than 30, please enter a number: " );
				}
				else if (finalExam < 0) { //check to make sure input is greater than 0
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
		input.close();
	}
	
	public void calculateGrades() {
		theory = ((test+finalExam)/55)*100;
		practical = ((hybrid+lab)/45)*100;
		finalGrade = test+finalExam+hybrid+lab;
	}
	public void displayGrades() {
		System.out.println("Theory grade: "+format.format(theory)+"%");
		System.out.println("Practical grade: "+format.format(practical)+"%");
		System.out.println("Final grade: "+format.format(finalGrade)+"%");
	}

}
