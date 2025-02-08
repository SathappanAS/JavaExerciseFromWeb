package accModTwo;

import accModOne.arizona;

public class india extends arizona {

	@Override
	public void test() {
		System.out.println("testindia");
	}
	
	public static void main(String[] args) {
		
		arizona a3=new arizona();
		a3.state="usa";

		//a3.test();
		
		arizona a4=new india();
		a4.state="test";
	
	}

}
