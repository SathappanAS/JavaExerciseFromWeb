package Exercises;
/*Java Program to Find LCM of Two Numbers*/
/*Least Common Multiple*/
/*(a > b): This is the condition being evaluated. It checks whether the value of a is greater than the value of b.

? a : b: This is the ternary operator.

If the condition (a > b) evaluates to true, then the value of a will be assigned to ans.
If the condition (a > b) evaluates to false, then the value of b will be assigned to ans.
*/
public class program9 {

	public static void main(String[] args) {
		int a = 9;
		int b = 5;
		
		int ans = (a>b) ? a:b;
		
		while(true) {
			if (ans%a == 0 && ans%b==0)
				break;
			ans++;
				
	}
		System.out.println(ans);
	}
}