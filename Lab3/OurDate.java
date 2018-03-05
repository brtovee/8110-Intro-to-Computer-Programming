import java.util.Scanner;	//program uses class Scanner
/* lab 3 - CST8110 18W
 * Bruce Tovee
 * Class that allows the calculation of the difference between an inputed date and a set date
 */
public class OurDate {
	//instance variable
	int month = 1, day = 1, year = 2000; 
	Scanner input = new Scanner (System.in);

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
		System.out.println(year + "/" + month + "/" + day);
	}
	public int calcDays() { //method calculates the numbeer of days since Jan 1st,2000 (months are assumed 30days)
		return (((year - 2000)*360) + ((month-1)*30) +  (day-1));
		
	}
}
