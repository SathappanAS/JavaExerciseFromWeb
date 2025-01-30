package exceptionHandlingPartice;
/*Error handling in java - Interivew question*/
public class stackOverflowErrorHandlingtwo {

	public static void test() {
		test();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("A");
		
		try {
			stackOverflowErrorHandlingtwo.test();
		}
		catch(Error e){  //Handle stackOverflowErrorHandlingtwo
			System.out.println("some error is coming"); 
			e.printStackTrace();
		}

		System.out.println("Bye");
	}
}