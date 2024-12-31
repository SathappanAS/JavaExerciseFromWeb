package LearnTwoExerciseProgram;
import java.util.Scanner;
/*Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed.
 *The numbers should be added and the sum displayed. the loop should ask the user whether he or she wishes to perform the operation again.
 *If so, the loop should repeat; otherwise it should terminate.
 **/
public class questionTen {

	public static void main(String[] args) {
		
		String ans = "";
		
		do {
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter two numbers");
			
			int n1=obj.nextInt();
			int n2=obj.nextInt();
			int sum=n1+n2;
			
			System.out.println("The sum is " +sum);
			System.out.println("Do you want to continue   ");
			
			Scanner obj1=new Scanner(System.in);
			ans=obj1.nextLine();
			
		}while(ans.equals("yes"));
		

	}

}
