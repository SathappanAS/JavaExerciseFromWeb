package LearnTwoExerciseProgram;
/*Print largest power of 2 less than or equal to N*/
/*Sample Input : N=23*/
/*Sample Output - 2 4 6 8 16*/
public class questionNine {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int m=1;
		for(int i=1;i<=N;i++) {
			m=2*m;
			System.out.println(m);
		}

	}

}
