package Constructor;
/*4. Chaining Constructors
Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. 

Implement a default constructor and a parameterized constructor that takes all three instance variables. Use constructor chaining to initialize the variables. 

Print the values of the variables.*/
public class Student {
	
	int studentId;
	String studentName;
	char grade;
	
	public Student() {
		System.out.println("Chaining Constructors");
	}

	public Student(int studentId,String studentName, char grade) {
		this(); 
		this.studentId=studentId;
		this.studentName=studentName;
		this.grade=grade;
	}
	
	public static void main(String[] args) {
		Student s1=new Student(10,"Sathappan",'M');
		System.out.println(s1.studentId  + " " + s1.studentId + " " + s1.grade);

	}

}
