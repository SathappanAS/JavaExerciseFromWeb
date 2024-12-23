package LearnOneBasisExerciseProgram;
/*
 * Write a Java program to compute body mass index (BMI). 
Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721
*/
public class BMI {

	public static void main(String[] args) {
		double weight = Double.parseDouble(args[0]);
		double height = Double.parseDouble(args[1]);
		double BMI = (weight*703) / (height*height);
		System.out.println("Body Mass Index is " + BMI);

	}

}
