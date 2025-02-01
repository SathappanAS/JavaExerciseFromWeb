package accessModifierOne;

public class staff extends school{
	
	
	public void teacher() {
		System.out.println("school---teacher");
	}
	
	@Override
	public void building() {
		System.out.println("school---building");
	}
	

	@Override
	protected void principal() {
		System.out.println("school---principal");
	}
	
	public static void main(String[] args) {
		
		school s1=new school();
		s1.location();
		s1.building();
		s1.principal();
		
		//Top casting
		//Child class object can be referred by parent object reference
		school s2=new staff();
		s2.building();
		s2.principal();
		
		
		
	}

}
