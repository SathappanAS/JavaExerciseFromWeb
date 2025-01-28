package exceptionHandlingPartice;

public class praticesPgOne {
	
	public static void tester() {
			tester();
	
	}

	public static void main(String[] args) {
		
		System.out.println("testing");
		
		try {
		praticesPgOne.tester();
		}
		catch(Error e) {
			e.printStackTrace();

		}
		
		System.out.println("close");

	}

}
