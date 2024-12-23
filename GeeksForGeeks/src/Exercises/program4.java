package Exercises;
/*Write a Java Program to convert Integer numbers and Binary numbers.*/
/*Input: 9 */
/*Output: 1001*/
public class program4 {
	public static void main(String[] args) {
		//int a=9;
		int b=9%2; //1
		int c=9/2; //4
		
		System.out.print(b + " ");
		
		int d=c%2; //0
		int d1=c/2; //2
		
		System.out.print(d + " ");

		int e=d1%2;  //0
		int e1=d1/2; //1
		
		System.out.print(e + " ");
		
		int f=e1%2; //1
		
		System.out.print(f+ " ");
	}
}