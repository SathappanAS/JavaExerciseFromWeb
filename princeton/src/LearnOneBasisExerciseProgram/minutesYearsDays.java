package LearnOneBasisExerciseProgram;
/*Write a Java program to convert minutes into a number of years and days. Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days
 * */
public class minutesYearsDays {

	public static void main(String[] args) {
		int minutes = Integer.parseInt(args[0]);
		
		int year = minutes/(365*24*60*1); //6
		int daysInMins = minutes%(365*24*60*1); 
		int remdays = daysInMins/(24*60); 
		System.out.println(minutes + " minutes is approximately "  + year + " and " +  remdays + " days" );
	}

}
