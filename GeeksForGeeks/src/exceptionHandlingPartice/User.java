package exceptionHandlingPartice;
/*Important question*/
public class User {

	public static void div(int a,int b) {
		System.out.println("div method");
		
		
		int d=0;
		try {
		 d=a/b;
		}
		catch(ArithmeticException e) {
			//reporting/logging/screenshot/fail/validating message
			System.out.println("AE ---error");
			e.printStackTrace(); //LIFO 
		}
		System.out.println("div done: " + d);
	}
	
	public static void main(String[] args) {
		
		div(10,0);
		System.out.println("bye!!");
	}

}

/*
 *Output
 *
 * 	div method
	Exception in thread "main" java.lang.ArithmeticException: / by zero
						at GeeksForGeeks/exceptionHandlingPartice.User.div(User.java:7)
						at GeeksForGeeks/exceptionHandlingPartice.User.main(User.java:13)
 */