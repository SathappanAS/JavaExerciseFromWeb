package Constructor;
/* Constructor Overloading

Write a Java program to create a class called "Book" with instance variables 
title, author, and price. Implement a default constructor and two parameterized constructors:

One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.
 
 */
public class Book {

	String title;
	String author;
	int price;
	
	public Book() {
		System.out.println("Enter the book information");
	}
	
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	
	public Book(String title,String author,int price) {

		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public static void main(String[] args) {
		Book b2 = new Book();
		Book b1=new Book("Java","naveen",10);
		System.out.println(b1.author + " " + b1.title + " " + b1.price);
		//Book b2=new Book();
		
		Book b3 = new Book("chennai","pathern");
		System.out.println(b1.author + " " + b1.title );
		

	}

}
