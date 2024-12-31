package LearnTwoExerciseProgram;
/*Write a program that takes a positive integer as input. It should then print the multiplication table of that number*/
//sample Input : 5
// Sample Output : 5, 10, 15, 20  .....50
public class questionThree {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int i=1;
		while (i<=10){
			int Multiplication= N*i;
			System.out.println(N + " * " +  i + " = " + Multiplication);
			i++;
		}
	}
}