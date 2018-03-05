import java.text.DecimalFormat;
import java.util.Scanner;	//import Scanner for user entry
public class InLab1 {

	public static void main(String[] args) {
		
		double width,length, perimeter;
		DecimalFormat format = new DecimalFormat("#.##");
		Scanner input = new Scanner (System.in); //creating scanner
		System.out.println("This program, written by Bruce Tovee, will calculate the perimeter of a rectangle");
		System.out.print("Enter the width: ");
		width = input.nextDouble();
		System.out.print("Enter the length: ");
		length = input.nextDouble();
		perimeter = ((2*length)+(2*width));
		System.out.println(width + " by " + length + " has a perimeter of "+ perimeter);
	}

}
