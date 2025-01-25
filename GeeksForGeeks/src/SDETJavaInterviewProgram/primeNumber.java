package SDETJavaInterviewProgram;
/*  Java program to find Primenumber  */

import java.util.Scanner;

//A number that can only be divided by 1 and itself is called a prime number

//Example: 2, 3, 5, 7, 11 are all prime numbers. 
public class primeNumber {

	public static void main(String[] args) {
		
		Scanner num=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number=num.nextInt();
		
		boolean flagIsPrime=true;
		
		for(int i=2;i<(number-1);i++) {
			if(number%i==0) {
				flagIsPrime=false;
				break;
			}
		}
		
		if(flagIsPrime) {
			System.out.println(number+ " is a prime number");
		}
		else {
			System.out.println(number + " is a not prime number");
		}
	}

}