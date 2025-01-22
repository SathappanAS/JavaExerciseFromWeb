package callByReferenceExample;

public class ProgramOne {

	public void test() {
		System.out.println("Non-static function");
		System.out.println("");
	}
	
	public static void developer(ProgramOne ob) {
		System.out.println("static function");
		ob.test();
		
	}
	
	
	public static void main(String[] args) {
		
		ProgramOne p1=new ProgramOne();
		p1.test();
		System.out.println("Static function calls the Non-Static Function :"
				+ "Have to use object reference: call by ref");
		System.out.println("");
		ProgramOne.developer(p1);

	}

}
