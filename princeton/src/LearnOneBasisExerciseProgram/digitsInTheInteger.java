package LearnOneBasisExerciseProgram;
/*Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16
 * */
public class digitsInTheInteger {

	public static void main(String[] args) {
		int N=Integer.parseInt(args[0]);
		
		int q1=N%10; //5
		int r1=N/10; // 56
		
		int q2=r1%10; //6
		int r2=r1/10; //5
		
		int q3=r2%10; //5
		
		int sum=q1+q2+q3;
		
		System.out.println(sum);

	}

}
