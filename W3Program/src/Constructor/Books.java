package Constructor;
/*Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, 
 * and methods to add and remove books from a collection.*/
public class Books {

	private String title;
	private String author;
	private String ISBN;
	//FULL SETTER OR CONSTRUCOR
	public Books(String title,String author,String ISBN) {
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	
	
	
	public static void main(String[] args) {
		Books B1=new Books("Java","Naveen","ISBN");
		
		System.out.println(B1.getTitle());
		System.out.println(B1.title);
	}

}