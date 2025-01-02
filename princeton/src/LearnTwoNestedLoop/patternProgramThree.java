package LearnTwoNestedLoop;
/*1
 *2 1
 *3 2 1
 *4 3 2 1*/
 
public class patternProgramThree {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=i;j>=1;j--) {
				if(i>=j) {
					System.out.print(j + " ");
				}
			}
			System.out.println(" ");
		}

	}

}
