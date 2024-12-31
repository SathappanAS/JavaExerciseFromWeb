package LearnTwoExerciseProgram;
/*Write a program to print Fibonacci series of n terms where n is input by user */
// 0 1 1 2 3 5 8 13 24
public class questionEight {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int n1=0;
		int n2=1;
		int n3;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=1;i<=N;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}

	}

}
