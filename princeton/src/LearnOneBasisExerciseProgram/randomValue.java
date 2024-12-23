package LearnOneBasisExerciseProgram;
/*
Write a Java program to convert temperature from Fahrenheit to Celsius degree. 
Formula: (X°F − 32) × 5/9 = Y°C
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
 */
public class randomValue {

	public static void main(String[] args) {
		int N=Integer.parseInt(args[0]);
		double r = Math.random();
		int t=(int)r*N;
		System.out.println(N);
		System.out.println(r);
		System.out.println(t);
	}
}