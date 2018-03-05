import java.util.Scanner;

public class Lab5 {
 public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double f = 0, s = 0, ans = 0;
		String o = "";
		boolean loop = true;

		System.out.println("Simple calculator");
		
		System.out.print("First number:");
		f = input.nextDouble();
		
		System.out.print("Please enter an operation: ");
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
	
		loop = true;
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
