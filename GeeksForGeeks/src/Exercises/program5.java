package Exercises;
/*Write a Program to Find Factorial of a Number in Java.*/

//Input :5 (5*4*3*2*1)
//Output :120

public class program5 {

	public static void main(String[] args) {
		int N=Integer.parseInt(args[0]);
		
		int factorial = 1;
		
		for(int i=1;i<=N;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

}