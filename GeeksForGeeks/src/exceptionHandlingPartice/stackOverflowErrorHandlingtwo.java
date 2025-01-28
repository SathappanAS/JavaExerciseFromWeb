package exceptionHandlingPartice;

public class stackOverflowErrorHandlingtwo {

	public static void test() {
		test();
	}
	
	public static void main(String[] args) {
		
		System.out.println("A");
		
		try {
			test();
		}
		catch(Exception e){  //Handle stackOverflowErrorHandlingtwo
			System.out.println("some error is coming"); 
			e.printStackTrace();
		}

		System.out.println("Bye");
	}
}
