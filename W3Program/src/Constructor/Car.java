package Constructor;
/*Constructor with Default Values
Write a Java program to create a class called Car with instance variables make, model, and year. 
Implement a parameterized constructor that initializes these variables and assigns default values if not provided. Print the values of the variables.*/
public class Car {
	// instance variables ..Make/Model/Year
	private String make;
    private String model;
    private int year;
	
 // Parameterized constructor with default values
	public Car(String make,String model,int year) {
		
		// Initialize make with the provided parameter or a default value
		this.make = (make == null || make.isEmpty()) ?  "Unknown model" : make;
		/*make == null || make.isEmpty(): This checks if the make variable is null or if it's an empty string*/
		
		/*? "Unknown Make" : make: This is the ternary conditional operator. If the condition (make == null || make.isEmpty()) is true, 
		 * it assigns the string "Unknown Make" to this.make. 
		 * If the condition is false (meaning make is neither null nor empty), it assigns the value of make to this.make*/
		
		this.model = (model == null || model.isEmpty()) ? "Unknown model" : model;
		this.year = (year<=0) ? 2000 : year;
	}
	
	
	public static void main(String[] args) {
        // Create a new Car object with valid data
        Car car1 = new Car("Toyota", "Corolla", 2021);
        // Print the values of the instance variables for car1
        System.out.println("Car 1 Make: " + car1.make);
        System.out.println("Car 1 Model: " + car1.model);
        System.out.println("Car 1 Year: " + car1.year);

        // Create a new Car object with some invalid data
        Car car2 = new Car("", "", -1);
        // Print the values of the instance variables for car2
        System.out.println("Car 2 Make: " + car2.make);
        System.out.println("Car 2 Model: " + car2.model);
        System.out.println("Car 2 Year: " + car2.year);
    }

}
