package exceptionHandlingPartice;

public class particesPg2 {
	
	String name;
	public static void main(String[] args) {
	
		System.out.println("Open");
		
		try {
			particesPg2 pg=new particesPg2();
			pg=null;
			pg.name="tester";
			
		}
		catch(NullPointerException e) {
			e.printStackTrace(); //LIFO
		}
		catch(ArithmeticException e) {
			e.printStackTrace(); //LIFO
		}
		catch(RuntimeException e) {
			e.printStackTrace(); //LIFO
		}
		catch(Exception e) {
			e.printStackTrace(); //LIFO
		}
		catch(Throwable e) {
			e.printStackTrace(); //LIFO
		}
		
//		catch(Object e) {  //OBJECT WE CAN'T CREATE
//			e.printStackTrace(); //LIFO
//		}
//		
		System.out.println("closed");

	}

}
