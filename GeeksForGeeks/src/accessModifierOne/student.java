package accessModifierOne;

public class student extends school{

	public void student() {
		System.out.println("school---student");
	}
	
	@Override
	public void building() {
		System.out.println("school---building");
	}
	
	@Override
	void principal() {
		System.out.println("school---principal");
	}
	
}

