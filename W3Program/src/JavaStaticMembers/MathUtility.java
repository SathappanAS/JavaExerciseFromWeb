package JavaStaticMembers;

public class MathUtility {
	
	
	public static int sum(int a,int b) {
		
		int add=a+b;
		System.out.println("sum of two numbers " + add);
		return add;
	}

	public static void main(String[] args) {
		MathUtility.sum(11,89);

	}

}
