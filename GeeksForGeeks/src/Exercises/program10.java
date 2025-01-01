package Exercises;
/*HCF of 10 and 20 is 10, and HCF of 9 and 21 is 3.*/
public class program10 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int i=2;
		for(;i<num1;i++) {
			if(num1%i==0) {
				//System.out.println(i);
				break;
			}}
			
		int j=2;
			for(;j<num1;j++) {
				if(num2%j==0) {
					//System.out.println(j);
					break;
				}
			}
		
			if(i==j) {
				System.out.println(i);
			}
			
			
		}

	}
