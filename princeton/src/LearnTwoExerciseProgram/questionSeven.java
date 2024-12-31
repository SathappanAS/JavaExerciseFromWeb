package LearnTwoExerciseProgram;
/*prime number*/
/*
Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number
A number is a prime number if it is divisible only by 1 and itself.
Example: 1,5,7,11
Any whole number greater than 1 that is divisible only by 1 and itself, is defined as prime number
2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97
 */
public class questionSeven {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		boolean flagIsPrime=true;
		
		for(int i=2;i<=((N/2)-1);i++) {
			if(N%i==0) {
				flagIsPrime=false;
				break;}}
		
		if(flagIsPrime) {
			System.out.println(N+ " is a prime number");
		}
		else {
			System.out.println(N+ " is a not prime number");
		}
	}
}