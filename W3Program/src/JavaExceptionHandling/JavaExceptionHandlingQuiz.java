package JavaExceptionHandling;

public class JavaExceptionHandlingQuiz {
	
	public static void test() {
		test();
	}

	public static void main(String[] args) {
	    
		System.out.println("test");
		
		try {
			JavaExceptionHandlingQuiz.test();
		}
		catch(Error e) {
			e.printStackTrace();
		}
		
		System.out.println("Program end");
		
    }
}
	   

