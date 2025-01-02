package LearnTwoNestedLoop;
/*4 3 2 1
 * 4 3 2
 *  4 3
 *   4 
 * */
public class patternProgramSeven {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
							
							if(i==1 && j==1) {
								System.out.print("");
							}
							if(i==2 && j==2) {
								System.out.print(" ");
							}
							if(i==3 && j==3) {
								System.out.print("  ");
							}
							if(i==4 && j==4) {
								System.out.print("   ");
							}
					if(i<j) {
						System.out.print(6-j+ " ");
					}
					
			}
			System.out.println("  "+" ");
		}	
		
	}
}
