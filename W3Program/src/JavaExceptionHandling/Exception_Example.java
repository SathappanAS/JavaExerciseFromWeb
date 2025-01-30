package JavaExceptionHandling;
/*Write a Java program that throws an exception and catch it using a try-catch block.*/
public class Exception_Example {
	int c;
	public int add(int a,int b) {
	
		try {
		int c=a/b;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public void call() throws ArithmeticException  {
		add(10,0);
	}
	
	
	public static void main(String[] args) {
	
		Exception_Example ob=new Exception_Example();
		ob.call();
		System.out.println("Program closed");

	}

}
