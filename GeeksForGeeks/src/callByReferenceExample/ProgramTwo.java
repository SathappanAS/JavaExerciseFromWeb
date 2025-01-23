package callByReferenceExample;

public class ProgramTwo {

	
	public int sum(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	
	public static void result(ProgramTwo p1) {  //call be reference -- class name reference variable
		System.out.println("sum result");
		p1.sum(40, 10);
	}
	
	public static void main(String[] args) {
		ProgramTwo p2=new ProgramTwo();
		System.out.println(p2.sum(10, 30));
		
		
		ProgramTwo.result(p2); //call be reference

	}

}
