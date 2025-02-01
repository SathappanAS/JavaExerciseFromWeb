package accessModifierTwo;

public class staff extends college {

	public void teacher() {
		System.out.println("college---teacher");
	}
	
	@Override
	public void building() {
		System.out.println("college---building");
	}
	
	//We can't override the private methods
	protected void boardMem() {
		System.out.println("college---boardMem");
	}

	@Override
	public void principal() {
		System.out.println("college---principal");
	}
	
}


