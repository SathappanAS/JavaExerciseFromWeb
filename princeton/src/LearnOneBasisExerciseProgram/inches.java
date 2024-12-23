package LearnOneBasisExerciseProgram;
/* Write a Java program that reads a number in inches, converts it to meters. Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters
 * */
public class inches {

	public static void main(String[] args) {
		double in = Double.parseDouble(args[0]);
		double meter =in*0.0254; 
		System.out.println(in + " inch is " + meter + " meters");
	}}