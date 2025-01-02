package LearnTwoNestedLoop;
/* *
 * - -
 * * * * 
 * - - - -
 * */
public class patternProgramTestThree {

		public static void main(String[] args) {
			for(int i=1;i<=4;i++) {
				for(int j=1;j<=4;j++) {
					if(i>=j & i%2==0) {
						System.out.print("-" + " ");
					}
					if(i>=j & i%2!=0) {
						System.out.print("*" + " ");
					}	
					
				}
				System.out.println(" ");
			}	
		}
	}
