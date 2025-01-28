package exceptionHandlingPartice;

public class errorHandlingOne {

	public static void main(String[] args) {
		
		System.out.println("A");
		
		try {
			int i=9/0; //ArithmethicExceptionError
		}
//		catch(Error e){  //It will not handle ArithmethicException
//			System.out.println("some error is coming");
//			e.printStackTrace();
//		}
		catch(Throwable e){  //It will not handle ArithmethicException
		System.out.println("some error is coming");
		e.printStackTrace();
	}


		System.out.println("Bye");
	}

}
