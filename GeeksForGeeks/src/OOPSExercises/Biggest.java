package OOPSExercises;

public class Biggest {
	
	 // Constructor to initialize the array
	private int[] num;
	
	 // Method to find and display the 
	 // largest element in the array
	public Biggest(int[] numbers) {
	       this.num = numbers;
	}
	
	 public void display() {
	       if (num== null || num.length == 0) {
	           System.out.println("Array is empty.");
	   return;
	       }
	       
	       
	       int l=num[0];
	       for (int i=0;i<num.length;i++) {
	    	   if (num[i] > l) {
	               l = num[i];
	           }
	       }
	       System.out.println("The largest element in the array is: " + l); 
	 }
	
	
	
	public static void main(String[] args) {
		int[] arr = {10, 45, 5, 8, 25};
		System.out.println("Lenght of an array" + arr.length);
	       Biggest b = new Biggest(arr);
	       b.display();
	       

	}

}
