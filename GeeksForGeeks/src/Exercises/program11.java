package Exercises;

import java.util.Scanner;

/* 	Input: N = 11
	Output: 2, 3, 5, 7, 11*/
//A number is a prime number if it is divisible only by 1 and itself.
public class program11 {
	public static void main(String[] args) {
		   // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        // Outer loop to check for prime number logic
        for (int i = 2; i <= number / 2; i++) {
            // Inner loop to check if the number is divisible by any i
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    break; // i is not a prime number, break inner loop
                }
            }
            if (number % i == 0) {
                isPrime = false; // If number is divisible by i, it's not prime
                break; // No need to check further, exit outer loop
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}