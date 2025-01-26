package SDETJavaInterviewProgram;

import java.util.Scanner;

/*Javaprogram to find Fibonacciseries upto a given number range*/
/*Fibonacci sequence begins with the following 14 integers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233*/
public class FibonacciSeries {

	
	
	public static void main(String[] args) {
		
		Scanner num=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number=num.nextInt();
		
		int n1=0;
		int n2=1;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0;i<=number;i++) {
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}

	}

}
