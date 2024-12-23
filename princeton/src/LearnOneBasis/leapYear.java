package LearnOneBasis;
/*Is a given year a leap year?*/
/*Yes if either (i) divisible by 400 or (ii) divisible by 4 but not 100.*/
public class leapYear {

	public static void main(String[] args) {
		
		int year = Integer.parseInt(args[0]);
		boolean isLeapYear;
		
		isLeapYear = (year%4 == 0) && (year%100!=0);
		isLeapYear = isLeapYear || (year%400==0) ;
		
		System.out.println(isLeapYear);

	}

}
