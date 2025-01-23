package inheritanceTopandUpCastingExample;

public class University {

	public void principal() {
		System.out.println("University-----Prinicpal");
	}
	
	public void HoD() {
		System.out.println("University-----HoD");
	}
	
	public static void facility() { //Method hiding : Static method in parent class and the same child class
		System.out.println("University-----facility");
	}

	
}
