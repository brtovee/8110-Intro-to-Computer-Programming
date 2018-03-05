import java.util.Scanner;

public class Lab6 {
	private int value1, value2, gcf;
	Scanner input = new Scanner (System.in);
	
	public void getValues() {
		value1 = 0;
		value2 = 0;
		boolean loop = true;
		
		System.out.print("Enter value1: ");
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
		System.out.print("Enter value2: ");
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
	
	public void calculateGcf() {
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
	public void display() {
		System.out.println("The greatest common factor of " + value1 + " and "+ value2 +" is " +gcf);
	}
	
}
