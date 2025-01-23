package Constructor;
/*Default Constructor:
Write a Java program to create a class called 
"Cat" with instance variables name and age. 
Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.*/

public class Cat {
	String name;
	int age;
	
	public Cat() {
		this.name="Unknown";
		this.age=10;
	}
	
	public static void main(String[] args) {
		Cat c1=new Cat();
		System.out.println(c1.name + " " + c1.age);

	}

}