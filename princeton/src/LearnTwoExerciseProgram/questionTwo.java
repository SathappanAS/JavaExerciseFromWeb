package LearnTwoExerciseProgram;
/*Write a program to calculate the sum of the first 10 natural numbers*/
public class questionTwo {

	public static void main(String[] args) {
		
		int i=1;
		int sum=0;
		while(i<=10) {
			sum=sum+i;
			//i++;
			++i;
		}
		System.out.println(sum);
	}
}