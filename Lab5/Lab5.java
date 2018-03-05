import java.util.Scanner;
/* Author Bruce Tovee
* basic calculator with basic error checking
*/
public class Lab5 {
 public static void main(String[] args) {
	 	//variables
		Scanner input = new Scanner (System.in);
		double f = 0, s = 0, ans = 0;
		String o = "";
		boolean loop = true;

		System.out.println("Simple calculator");
		
	 	//first number
		System.out.print("First number:");
		f = input.nextDouble();
		
	 	//operator
		System.out.print("Please enter an operation: ");
	 	//error checking to makes sure operator is valid
		while(loop) {
			o = input.next();
			if(o.equals("+") || o.equals("-") || o.equals("/") || o.equals("*") || o.equals("%")) {
				loop = false;
			}
			else {
				System.out.print("Please enter a valid operation: ");
			}
		}
		System.out.print("Second number: ");
	
	 	//second number
		loop = true;
	 	//error checking to makes sure that you dont divide by 0
		if(o.equals("/") || o.equals("%")) {
			while(loop) {
				s = input.nextDouble();
				if(s == 0) {
					System.out.print("Please pick a non-zero number: ");
				}
				else {
					loop = false;
				}
			}
		}
		else {
			s = input.nextDouble();
		}
		
	 	//calculate answer depending on which operator was selected
		if(o.equals("+")){
			ans = f + s;
		}
		else if(o.equals("-")) {
			ans = f - s;
		}
		else if(o.equals("*")) {
			ans = f * s;
		}
		else if(o.equals("/")) {
			ans = f / s;
		}
		else {
			ans = f % s;
		}
		
		System.out.println(f +" "+ o +" "+ s + " = " + ans);
		input.close();
	}

}
