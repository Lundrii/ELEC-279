
public class Stock {
	private int day;
	private int month;
	private int year;
	private String name;
	private int[] values = new int [7];

	public Stock () {
		day = 1;
		month =1;
		year = 1;
		name = "";
		
		
}

	public Stock (int dayIn, int monthIn, int yearIn, String nameIn, int[] valIn) {
		dayIn = 1;
		monthIn = 1;
		yearIn = 1;
				
	
		day = dayIn;
		month = monthIn;
		year = yearIn;
		
		name = nameIn;
	
		for(int i = 0 ; i < valIn.length; i++)
		values[i] = valIn[i];
	}
	public int getDay () {
		return day;
			 
 }
	public int getMonth () {
		return month; 
 }
	public int getYear () {
		return year; 
 }
	public String getName () {
		return name;
	}
	
	public int getValue (int ind) {
		if (ind >= 0 && ind <= 6) {
			return values[ind]; }
		else {
				System.out.println ("error");
				return -1;}
		
	}
	public void setName(String nameIn){
		name = nameIn;
	} 
	public void setValue(int val, int ind){
			
		if (ind >= 0 && ind <= 6 && val >= 0) {
		values[ind] = val; }
		else {
				System.out.println ("error");}
	}
	

	public void printStock(){ 
		for  (int i =0; i < values.length; i++) {
		System.out.print (values[i] + ", ");
		}
		System.out.println();
	}
	
	public int getMeanValue() {
		//calculate mean of stock
		int sum = 0;
		int avg = 0;
		for (int i =0; i < values.length; i++)  {
			sum =+ (values[i]);
		 }
		avg = sum/7;
		return avg;
	}

		
	} 


