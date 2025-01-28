package exceptionHandlingPartice;

public class testTwo {
	String name;
	
	public static void main(String[] args) {
		
		System.out.println("open");
		System.out.println("open");
		System.out.println("open");
		
		try {
			int i=9/3;
			testTwo obj=new testTwo();
			obj = null;
			obj.name="testing"; //NullPointerException
		}
		catch(ArithmeticException e) 
		{
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		catch(NullPointerException e) 
		{
			System.out.println("Null is coming");
			e.printStackTrace();
		}

	}

}
