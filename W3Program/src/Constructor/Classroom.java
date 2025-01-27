package Constructor;
/*Constructor with Array Initialization
Write a Java program to create a class called Classroom with instance variables className and students (an array of strings). 
Implement a parameterized constructor that initializes these variables. Print the values of the variables.*/
public class Classroom {
	
	private String className;
	private String[] students;
	
	
	 // Parameterized constructor that initializes className and students
    public Classroom(String className, String[] students) {
        // Initialize instance variables with provided parameters
        this.className = className;
        this.students = students;
    }
    
    public void printclassRoom() {
    	
    	
    	System.out.println("Class Name: " + className);
    	 System.out.print("Students: ");
    	 
//    	 for (String student : students) {
//             System.out.print(student + " ");
//         }
    	 
    	 for(int i=0;i<students.length;i++) {
    		 
    		System.out.println(students[i]); 
//    		String[] student=new String[students.length];
//			students[i]=student[i];
//    		System.out.print(student + " ");
    	 }
    	 
    	 System.out.println("");
    }

	public static void main(String[] args) {
		  
		String[] studentsArray = {"testing", "tester", "test"};
		
		Classroom p1=new Classroom("Math",studentsArray);
		p1.printclassRoom();
		
	}

}
