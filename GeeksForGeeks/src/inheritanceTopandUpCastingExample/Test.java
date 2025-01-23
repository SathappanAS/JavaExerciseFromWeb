package inheritanceTopandUpCastingExample;

import java.util.concurrent.StructuredTaskScope.ShutdownOnSuccess;

public class Test {

	public static void main(String[] args) {
		System.out.println("----Top/Up Casting--------");
		University U1=new School(); 
		U1.principal();  //Override method School-----Prinicpal
		U1.HoD();		//Inherited Mehod
		U1.facility(); //Inherited Mehod
		
		
		//U1.parking();
		//BMW Individual method can't be called in Top/Down Approach. Reference Type CCheck will fail
		
		System.out.println("");
		System.out.println("----Normal--------");
		polytechnic P1=new polytechnic();
		P1.staff(); //indivial method
		P1.student(); //indivial method
		P1.principal(); //indivial method
		P1.facility(); //Override Method
		// P1.Book(); Private method can't call ouside the class
		P1.accessBook(); //indivial method
		P1.HoD(); //inherited method
		

	}

}
