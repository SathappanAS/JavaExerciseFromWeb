package OOPSExercises;
/*3.Create a class Employee with overloaded constructors to initialize employee details based on different combinations of arguments. 
 * 
 * Ensure the constructors support the creation of objects in various ways.*/
public class Employee {
	
	private String empName;
	private int age;
	private char gender;
	private String DOB;
	private int id;
	
	public Employee(String empName,int age) {
		this.empName=empName;
		this.age=age;
	}
	
	public Employee(String empName,int age,char gender) {
		this.empName=empName;
		this.age=age;
		this.gender=gender;
	}
	
	public Employee(String empName,int age,char gender,String DOB) {
		this.empName=empName;
		this.age=age;
		this.gender=gender;
		this.DOB=DOB;
	}
	
	public Employee(String empName,int age,char gender,String DOB,int id) {
		this.empName=empName;
		this.age=age;
		this.gender=gender;
		this.DOB=DOB;
		this.id=id;
	}
	
	public void display() {
		System.out.println(empName);
		if(id !=0) {
			System.out.println(id);
		}
	}

	public static void main(String[] args) {
		Employee myEmp=new Employee("testing",20);
		myEmp.gender = 'M';
		myEmp.DOB="01-01-1990";
		myEmp.id=1234;
		
		System.out.println(myEmp.empName + " " + myEmp.age + " " + myEmp.gender + " " + myEmp.DOB + " " + myEmp.id);
		myEmp.display();
	}

}
