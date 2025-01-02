package LearnTwoNestedLoop;
/*
 * 00 01 02 03
 * 10 11 12 13
 * 20 21 22 23
 * 30 31 32 33
 * */
public class patternProgramFive {
		public static void main(String[] args) {
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
						System.out.print(i+""+j+ " ");	
				}
				System.out.println(" ");
			}	
		}
	}