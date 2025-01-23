package ImportantJavaInterviewProgram;

public class ComparingObject {
	
	public ComparingObject(int a) {
		System.out.println(a);
	}
	
	public ComparingObject(short b) {
		System.out.println(b);
		}
	
	public static void main(String[] args) {
		ComparingObject b1=new ComparingObject(10);
		ComparingObject b2=new ComparingObject(10);
		System.out.println(b1 == b2);
	}

}
