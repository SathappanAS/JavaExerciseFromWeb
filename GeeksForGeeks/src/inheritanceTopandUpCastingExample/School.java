package inheritanceTopandUpCastingExample;

public class School extends University{ //IS-A Relationship

	public void staff() {
		System.out.println("School-----staff");
	}
	
	public void student() {
		System.out.println("School-----student");
	}
	
	@Override
	public void principal() {
		System.out.println("School-----Prinicpal");
	}
	
	public void parking() {
		System.out.println("School-----parking");
	}
	
	public static void facility() {
		System.out.println("School-----facility");
		Home work=new Home();
		work.Home();  //Composition - HAS A Relationship
	}
	
	private void raking() {
		System.out.println("School racking-----parking");
	}
	
}
