package accessModifierOne;

public class Bike {
	
	public void Wheels() {
		System.out.println("Bike has two wheels");
	}
	
	protected void brake() {
		System.out.println("Bike has one brake");
	}
	
	void window() {
		System.out.println("Bike--window");
	}
	
	private void name() {
		System.out.println("Bike--name");
	}

	
	public static void main(String[] args) {
		Tesla t1=new Tesla();
		t1.Wheels();
		//t1.glass();
		
		Car c1=new Car();
		c1.Wheels();
		//c1.seat();	
		
	}

}