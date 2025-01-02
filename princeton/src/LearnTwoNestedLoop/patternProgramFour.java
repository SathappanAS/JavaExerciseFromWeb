package LearnTwoNestedLoop;
/*
 *1
 *1 1
 *1 1 1
 *1 1 1 1*/
public class patternProgramFour {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i>=j) {
					System.out.print(1 + " ");
				}		
			}
			System.out.println(" ");
		}	
	}
}