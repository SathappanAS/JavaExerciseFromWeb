package exceptionHandlingPartice;

public class testOne {

	public static void main(String[] args) {
		
		System.out.println("open");
		
		try {
		int a=9/0;
		}
		catch(ArithmeticException e) 
		{
			System.out.println("ExceptionHandling");
			e.printStackTrace();
		}
		
		System.out.println("close ");
	}

}
