package Exercises;

public class program12 {

	public static void main(String[] args) {
		int year=Integer.parseInt(args[0]);
		boolean isLeapYear;
		isLeapYear = (year%4 == 0) && (year%100!=0); ///Divisible by 4 and not 100
		isLeapYear = isLeapYear || (year%400==0) ; //Divisible by 400
		if(isLeapYear==true) {
		System.out.println(year + " is a leapyear " );
		}
		else {
			System.out.println(year + " is  not a leapyear " );
			}	
		}
	

}
