package ImportantJavaInterviewProgram;

public class TrickyCounter {

	public static void main(String[] args) {
		
		//Integer Caching(Wrapper class): -128 to 127 : default --- -128 to 1000
		
		 Integer i1 = 999;		//no primitive to primitive : auto parking 
		 Integer i2 = 999;
		 System.out.println(i1 == i2);     // Line 1
		 
		 Integer i3 = 128;
		 Integer i4 = 128;
		 System.out.println(i3 == i4);     // Line 2
		 
		 Integer i5 = new Integer(127);
		 Integer i6 = new Integer(127);
		 System.out.println(i5 == i6);     // Line 3
		 
		 	/*Line 1: Comparing values <=127 so true
			Line 2: values are >127 (-128 to 127 are consider) so false
			Line 3: comparing objects so both are different instances so false*/
		 
		 // -XX:AutoBoxCacheMax=1000
	}

}
