package stringsInJava;

public class StringMethods {

	public static void main(String[] args) {
		
		String test="I am going to test string functions in java";
		
		System.out.println(test.charAt(9));
		
		
		
		int firstT = test.indexOf("t");
		System.out.println(firstT);
		
		int secondT = test.indexOf('t', firstT+1);
		System.out.println(secondT);
		
		int thirdT = test.indexOf('t', secondT+1);
		System.out.println(thirdT);
		
		int fourthT = test.indexOf('t', thirdT+1);
		System.out.println(fourthT);

	}

}