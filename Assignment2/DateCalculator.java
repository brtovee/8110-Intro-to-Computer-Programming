public class DateCalculator {
	private OurDate firstDate = new OurDate(); 
	private OurDate secondDate = new OurDate();
	private String message;

	public DateCalculator() { //default constructor
		System.out.println("Date Calculator - it's all relative");
	}
	public void inputDates() {  //getting 2 dates from use
		this.inputDate(firstDate);
		System.out.print("\n");
		this.inputDate(secondDate);
	}
	private void inputDate(OurDate date) { //get date values for date
		date.inputYear();
		date.inputMonth();
		date.inputDay();
	}
	public void calculateDifference() { //calc difference between first and second date

		//calc date dif between first and second date
		int f = firstDate.calcDays();
		int s = secondDate.calcDays();
		int d = f-s;


		//if first date is greater than second
		if(d>0) {

			//depending on the difference and how it can be divided, sets the message
			if(d/360 >=1 && d/360 <2 ) {
				message = String.format(" is %d year later than ", (d/360));
			}
			else if(d/360 >=2) {
				message = String.format(" is %d years later than ", (d/360));
			}
			else if(d/30 >= 1 && d/30 <2) { 
				message = String.format(" is %d month later than ", (d/30));
			}
			else if(d/30 >=2) {
				message = String.format(" is %d months later than ", (d/30));			
			}
			else if(d/7 >= 1 && d/7 < 2) {
				message = String.format(" is %d week later than ", (d/7));
			}
			else if(d/7 >2) {
				message = String.format(" is %d weeks later than ", (d/7));			
			}
			else if(d==1) {
				message = String.format(" is %d day later than ", d);
			}
			else {
				message = String.format(" is %d days later than ", d);
			}
		}
		//if second date is greater than first
		else if(d<0) {

			d *= -1; //making the negative difference into a positive number

			if(d/360 >=1 && d/360 <2 ) {
				message = String.format(" is %d year earlier than ", (d/360));
			}
			else if(d/360 >=2) {
				message = String.format(" is %d years earlier than ", (d/360));
			}
			else if(d/30 >= 1 && d/30 <2) { 
				message = String.format(" is %d month earlier than ", (d/30));
			}
			else if(d/30 >=2) {
				message = String.format(" is %d months earlier than ", (d/30));			
			}
			else if(d/7 >= 1 && d/7 < 2) {
				message = String.format(" is %d week earlier than ", (d/7));
			}
			else if(d/7 >2) {
				message = String.format(" is %d weeks earlier than ", (d/7));			
			}
			else if(d==1) {
				message = String.format(" is %d day earlier than ", d);
			}
			else {
				message = String.format(" is %d days earlier than ", d);
			}
		}
		else {
			message = " is the same as ";
		}

	}
	public void display() { // displays 2 dates and the difference
		firstDate.displayDate();
		System.out.print(message);
		secondDate.displayDate();
	}

}
