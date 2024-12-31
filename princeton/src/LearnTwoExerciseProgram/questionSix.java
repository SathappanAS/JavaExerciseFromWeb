package LearnTwoExerciseProgram;
/*Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
 * For example, if the input is 12345, the output should be 54321*/
public class questionSix {
	public static void main(String[] args) {	
			int N = Integer.parseInt(args[0]);
			int remainder =0;
			while (N!=0) {
				remainder=N%10; 
				System.out.print(remainder);
				N=N/10;		
			}	
	}
}