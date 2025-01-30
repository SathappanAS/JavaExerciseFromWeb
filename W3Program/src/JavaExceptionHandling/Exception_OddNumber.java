package JavaExceptionHandling;
/*Write a Java program to create a method that takes an 
 * integer as a parameter and throws an exception if the number is odd.*/
public class Exception_OddNumber {
	
	public static void number(int a) {
		System.out.println("Entered the number : " + a);
		
		if(a%2==0) {
			System.out.println("Entered number is even");
		}
		else {
			System.out.println("Entered number is old");
			throw new oldException("number is odd");
		}
			
	}

	public static void main(String[] args) {
		
		Exception_OddNumber.number(10);
		
		System.out.println("Program closed");

	}

}
