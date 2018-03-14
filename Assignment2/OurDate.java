import java.util.Scanner;	//program uses class Scanner
/**  Created:		Mar 1st, 2018
 *   Name:   		Bruce Tovee
 *   Section: 		CST8110_303
 *   Lab teacher:	Jason Mombourquette
 *   Purpose:		OurDate Class for the use of DateCalculator
 *   CST8110 Assignment 2 due Mar 16th, 2018
 */
public class OurDate {
	//instance variable
	private int month;
	private int day; 
	private int year; 
	private Scanner input = new Scanner (System.in);
	public OurDate() {
		month = 0;
		day = 0;
		year = 0;
		
	}
	public OurDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	public void inputDay() { //method that allows input of day
		System.out.print("Enter a day: ");
		day = input.nextInt();
	}
	public void inputMonth() { //method that allows input of Month
		System.out.print("Enter a month: ");
		month = input.nextInt();
	}
	public void inputYear() { //method that allows input of Year
		System.out.print("Enter a year: ");
		year = input.nextInt();
	}
	public void displayDate() { //method that displays the date
		System.out.print(year + "/" + month + "/" + day);
	}
	public int calcDays() { //method calculates the numbeer of days since Jan 1st,2000 (months are assumed 30days)
		return (((year - 2000)*360) + ((month-1)*30) +  (day-1));
		
	}
}
