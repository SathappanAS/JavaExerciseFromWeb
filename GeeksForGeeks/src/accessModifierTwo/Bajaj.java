package accessModifierTwo;

import accessModifierOne.Bike;
import accessModifierOne.Car;
import accessModifierOne.Tesla;

public class Bajaj extends Bike{

	@Override
	public void Wheels() {
		System.out.println("Bajaj has two wheels");
	}
	

	//@Override
	void window() {
		System.out.println("Bajaj--window");
	}
	
	private void Bajajname() {
		System.out.println("Bajajname--name");
		super.brake();
	}
	
	public static void main(String[] args) {
		Bike b1=new Bike();
		b1.Wheels();
	}


}		