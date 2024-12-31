package LearnTwoExerciseProgram;
/*Two Numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another*/
/*Example : Program takes '2' and '5' as input. The output should be 2^5*/
public class questionFive {
	public static void main(String[] args) {
		int pow1 = Integer.parseInt(args[0]);
		int pow2 = Integer.parseInt(args[1]);
		int pow=1;
		for(int i=1;i<=pow2;i++) {
			pow=pow*pow1;
		}
		System.out.println(pow);
	}
}