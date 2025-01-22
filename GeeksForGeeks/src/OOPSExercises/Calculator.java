package OOPSExercises;
/* 2. Create a class Calculator with the following methods:
	  calculateSum(int number1, int number2) to calculate the sum of two numbers.
	  calculateDifference(int number1, int number2) to calculate the difference between two numbers.
 * */
public class Calculator {
	
	public int calculateSum(int number1, int number2) {
		int sum=number1+number2;
		return sum;
	}
	
//	 public int calculateSum(int number1, int number2) {
//	       return number1 + number2;
//	   }
	
	public int calculateDifference(int number1, int number2) {
		int Difference=number1+number2;
		return Difference;
	}
	
//	 public int calculateSum(int number1, int number2) {
//	       return number1 + number2;
//	   }

	public static void main(String[] args) {
		
		Calculator p=new Calculator();
		int result = p.calculateSum(10, 10);
		int result2=p.calculateDifference(20,9);
		
		System.out.println(result);
		System.out.println(result2);

	}

}
