package Constructor;

import java.util.Scanner;

/*Write a Java program to create a class called Account with instance variables accountNumber and balance. 
 * Implement a parameterized constructor that initializes these variables with validation:

>>>>>accountNumber should be non-null and non-empty.
>>>>>balance should be non-negative.
>>>>>>Print an error message if the validation fails.*/
public class Account {

	private int accountNumber;
	private int balance;
	
	public Account(int accountNumber, int balance) {
		
		this.accountNumber=accountNumber;
		this.balance=balance;
		
		if (accountNumber >=0 && balance >=0) {
			System.out.println("enter the accountNumber :"  +  " " +accountNumber);
			System.out.println("enter the balance :"  +  " " +balance);
		}
		else {
			System.out.println("error message");
		}
	}
	
	public static void main(String[] args) {
		Account a1=new Account(1234567,99);
		
	}

}
