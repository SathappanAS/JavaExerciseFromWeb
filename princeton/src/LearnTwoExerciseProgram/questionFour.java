package LearnTwoExerciseProgram;
/*Write a program to find the factorial value of any number entered through the keyboard*/
// N! = 1*2*3.....N
public class questionFour {
	public static void main(String[] args) {		
		int N = Integer.parseInt(args[0]);
		int Factorial=1;
		for(int i=1;i<=N;i++) {
			Factorial = Factorial*i;
		}
		System.out.println(Factorial);
	}
}