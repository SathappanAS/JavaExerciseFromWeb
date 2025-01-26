package SDETJavaInterviewProgram;

import java.util.Scanner;

public class primenumberOOP {
	
	public static boolean primeNumber(int num) {
		for (int i = 2; i <= num / 2; i++) {
			//try each number by using %
			if (num % i == 0) { 
				return false;
								}
			}
		return true;
	}

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number=num.nextInt();
		
		if(primenumberOOP.primeNumber(number)) {
			System.out.println(number + " is a prime number.");
		} else {
				System.out.println(number + " is not a prime number.");
		}	
	}

}
