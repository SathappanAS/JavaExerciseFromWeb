package Constructor;
/*Overloading Constructors with Different Data Types
Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:

One constructor takes int parameters.
Another constructor takes double parameters.
Print the values of the variables for each constructor.*/
public class Point {
	
	private int x;
	private int y;
	
	public Point(int x) {
		this.x=x;
		System.out.println(x);
	}

	//Overloading Constructors
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point(double x,double y) {
		this.x=(int) x;
		this.y=(int) y;
	}
	
	//add() method
	public void add() {
		int z=x+y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		
		//Point p1=new Point(10);
		Point p2=new Point(10,20);
		//Point p3=new Point(4.5,4.7);
		p2.add();
	
	}

}
