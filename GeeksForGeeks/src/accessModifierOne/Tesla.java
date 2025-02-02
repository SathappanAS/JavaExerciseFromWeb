package accessModifierOne;

public class Tesla extends Car {

	@Override
	public void Wheels() {
		System.out.println("tesla has four wheels");
	}
	

	protected void glass() {
		System.out.println("tesla has a glass");
	}
	
	@Override
	void window() {
		System.out.println("tesla--window");
	}
	
	private void nameTesla() {
		System.out.println("tesla--name");
	}
	
}
