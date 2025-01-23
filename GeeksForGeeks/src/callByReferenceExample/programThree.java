package callByReferenceExample;

public class programThree {
	
	public void macAir() {
		System.out.println("mac");
	}
	
	public static void hp(programThree pp) {
		System.out.println("hp");	
		
//		programThree ch=new programThree();
//		ch.macAir();
//		(or)
		pp.macAir();
		
	}

	public static void main(String[] args) {
		
		programThree p1=new programThree();
		p1.macAir();
		programThree.hp(p1);
	

	}

}
