package accessModifierTwo;


import accessModifierOne.school;

public class student extends college {
	
	void student1() {
		
			System.out.println("college---student1");
		
		
	}
	
	public static void main(String[] args) {
		school s2=new school();
		s2.location();
		
		college c2=new staff();
		c2.building();
		c2.location();
		c2.principal();
		
		
		
		college c1=new college();
		c1.building();
		c1.location();
		c1.principal();
		
		staff s3=new staff();
		s3.building();
		s3.teacher();
		s3.principal();
		
		
	}

}
