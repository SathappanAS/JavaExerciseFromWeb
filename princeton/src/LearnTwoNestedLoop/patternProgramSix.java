package LearnTwoNestedLoop;
/*
 * 00 01 02 03
 * 	11 12 13
 * 	 22 33
 * 		33
 * */
public class patternProgramSix {

		public static void main(String[] args) {
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
								if(i==0 && j==0) {
									System.out.print("");
								}
								if(i==1 && j==1) {
									System.out.print(" ");
								}
								if(i==2 && j==2) {
									System.out.print("  ");
								}
								if(i==3 && j==3) {
									System.out.print("    ");
								}
						if(i<=j) {
							System.out.print(i+""+j+ " ");
						}
						
				}
				System.out.println("  "+" ");
			}	
			
		}
	}
