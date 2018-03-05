import java.util.Scanner;
/* Author: Bruce Tovee
* Asking for 2 number and finding the greatest common factor
*/
public class Lab6 {
	//variables
	private int value1, value2, gcf;
	Scanner input = new Scanner (System.in);
	
	public void getValues() {
		value1 = 0;
		value2 = 0;
		boolean loop = true;
		//value 1 input
		System.out.print("Enter value1: ");
		//error checking to makes sure value1 is greater than 0
		while(loop) {
			value1 = input.nextInt();
			if(value1 <= 0) {
				System.out.print("Enter value1 that is greater than 0: ");	
			}
			else {
				loop = false;
			}
		}
		
		loop = true;
		//value2 input
		System.out.print("Enter value2: ");
		//error checking to make sure value 2 is greater than 0
		while(loop) {
			value2 = input.nextInt();
			if(value2 <= 0) {
				System.out.print("Enter value2 that is greater than 0: ");	
			}
			else {
				loop = false;
			}
		}

	}
	
	public void calculateGcf() { // calculating the greatest common factor
		int a = value1;
		int b = value2;
		int temp;
		 while(b != 0) {
			 temp = a % b;
			 a = b;
			 b = temp;
		 }
		 gcf = a;
	}
	public void display() { //displaying both values and greatest common factor
		System.out.println("The greatest common factor of " + value1 + " and "+ value2 +" is " +gcf);
	}
	
}
