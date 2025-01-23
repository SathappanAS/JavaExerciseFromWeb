package inheritanceTopandUpCastingExample;

public class polytechnic extends University{

	public void staff() {
		System.out.println("polytechnic-----staff");
	}
	
	public void student() {
		System.out.println("polytechnic-----student");
	}
	
	@Override
	public void principal() {
		System.out.println("polytechnic-----Prinicpal");
	}
	
	public static void facility() {
		System.out.println("polytechnic-----facility");
		
	}
	
	private void Book() {
		System.out.println("polytechnicBook-----facility");
	}
	
	public void accessBook() {
		Book();
	}
	
}
