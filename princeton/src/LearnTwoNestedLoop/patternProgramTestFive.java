package LearnTwoNestedLoop;
/* 1
 * 1 2
 * 1 2 3
 * 1 2 3 4*/
public class patternProgramTestFive {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
					
					if(i>=j && i%2==0) {
					System.out.print(j + " ");
					}
					if(i%2!=0 && i>=j ) {
						System.out.print("*" + " ");
					}
						
			}
			System.out.println(" ");
		}	
	}
}