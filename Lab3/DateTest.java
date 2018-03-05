/* lab 3 - CST8110 18W
 * Howard Rosenblum
 */

public class DateTest {

	public static void main(String[] args) {
		OurDate date=new OurDate();
		System.out.print("Initial date is ");
		date.displayDate();
		date.inputYear();
		date.inputMonth();
		date.inputDay();
		System.out.print("Date is ");
		date.displayDate();
		System.out.println("There are " + date.calcDays() + " days");
	}

}