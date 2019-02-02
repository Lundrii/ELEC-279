
public class Activity {
	private int day;
	private int month;
	private int year;

	public Activity () { //set all atributes to 1
		day = 1;
		month =  1;
		year = 1;
}

	public Activity (int dayIn, int monthIn, int yearIn) { //set all atributes to one and then equate
	if (dayIn <= 31 && dayIn >0) {
		day = dayIn;}
	else
		System.out.println("error invalid day");
	if( monthIn >0 && monthIn <= 12)	{
		month = monthIn; }
	else
		System.out.println("error invalid month");
	if(yearIn >0) {
		year = yearIn; }
	else
		System.out.println("error invalid year");
	
}	
	public int getDay () {  //next few constructors return their respective variable
		return day;
			 
 }
	public int getMonth () {
		return month; 
 }
	public int getYear () {
		return year; 
 }
 

	public void setDate(int dayIn, int monthIn, int yearIn) {
		if (dayIn <= 31 && dayIn >0) {
			day = dayIn;}
		else
			System.out.println("error");
		if( monthIn >0 && monthIn <= 12)	{
			month = monthIn; }
		else
			System.out.println("error");
		if(yearIn >0) {
			year = yearIn; }
		else
			System.out.println("error");
		}
	

	public void printDate () {
		System.out.println(+day+"." +month+ "." + year);
	}
	}



