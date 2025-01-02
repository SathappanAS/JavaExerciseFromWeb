package Pattern;
/*
Input : n = 5
Output: 
           * 
         * * 
       * * * 
     * * * * 
   * * * * * 
 * */
public class ProgramTwo {
	// ij ij ij ij ij
	// 11 12 13 14 15
	// 21 22 23 24 25
	// 31 32 33 34 35
	// 41 42 43 44 45	
	// 51 52 53 54 55
	
	//i
	// 1  1  1  1  1
	// 2  2  2  2  2
	// 3  3  3  3  3
	// 4  4  4  4  4
	// 5  5  5  5  5
	
	//j
	// 5  4  3  2  1
	// 5  4  3  2  1
	// 5  4  3  2  1
	// 5  4  3  2  1
	// 5  4  3  2  1
	
	// ij
	// 15  14  13  12  11
	// 25  24  23  22  21
	// 35  34  33  32  31
	// 45  44  43  42  41
	// 55  54  53  52  51
	
			public static void main(String[] args) {
				for(int i=1;i<=5;i++) {
					for(int j=5;j>=1;j--) {
						if(i<j) {
							System.out.print("  ");
						}
						if(i>=j) {
							System.out.print("*" + " ");
						}		
					}
					System.out.println(" ");
				}
	}
		}

