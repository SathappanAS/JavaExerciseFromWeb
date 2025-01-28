package exceptionHandlingPartice;

public class parentException {
	String name;
	
	public static void main(String[] args) {
		
		System.out.println("open");
		System.out.println("open");
		System.out.println("open");
		
		try {
			int p[]=new int[2]; 
			p[5]=100; //ArrayIndexOutOfBoundsException
			
			int i=9/0; //ArithmeticException
			testTwo obj=new testTwo();
			obj = null;
			obj.name="testing"; //NullPointerException
		}
	//		catch(Exception e) {
	//		System.out.println("some exception is coming");
	//		e.printStackTrace();
	//	}
		/*First child exception should be displayed .. Parent child should in the last
		 * Object-->Throwable-->Exception-->Runtime Exception-->
		 * Arithmetic Exception/Null Pointer Exception/Class cascade Exception/Index out of bound Exception/illegal Arugment Exception
		 */
		catch(ArithmeticException e) 
		{
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		catch(NullPointerException e) 
		{
			System.out.println("Null is coming");
			e.printStackTrace();
			//if want to write any condition, close the DB after we receive the null pointer exception
			//Always good partices to add with exception handling hierarchy 
		}
		catch(RuntimeException e) { //allowed
			System.out.println("some exception is coming");
			e.printStackTrace();
		}
		
		catch(Exception e) { //allowed
			System.out.println("some exception is coming");
			e.printStackTrace();
		}
		
		catch(Throwable e) { //allowed
			System.out.println("some exception is coming");
			e.printStackTrace();
		}
		
		//		catch(Object e) { ==> Not allowed
		//			System.out.println("some exception is coming");
		//			e.printStackTrace();
		//		}
		
		/*It is always we can good pratices to write the multiple catch bloc*/

		System.out.println("close ");
		
	}

}
