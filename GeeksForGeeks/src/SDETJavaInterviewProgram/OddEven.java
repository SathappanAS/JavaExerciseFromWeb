package SDETJavaInterviewProgram;
/*Java program to Find OddorEven number*/
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner num=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number=num.nextInt();
		
		if(number%2==0) {
			System.out.println(number + " is a even number");
		}
		else {
			System.out.println(number + " is a old number");
		}
	}

}

