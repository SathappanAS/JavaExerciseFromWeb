package Exercises;
/*Java Program to Find the Largest of three Numbers*/
/*
Input: x = 7, y = 20, z = 56
Output: 56 // value stored in variable z
 */
public class program8 {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		
		if(x>y && x>z) {
			System.out.println(x + " is largest of three number");
		}
		else if (y>z) {
			System.out.println(y + " is largest of three number");
		}
		else {
			System.out.println(z + " is largest of three number");
		}
		
	}

}
