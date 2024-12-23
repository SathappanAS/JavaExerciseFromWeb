package LearnOneBasis;

public class inputOutputWarmup {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t = a;
        a = b;
        b = t;
        System.out.println(a);
        System.out.println(b);
	}
}

/*Humans prefer to work with strings
 *Program work more efficiently with numbers.
 * 
 * Output :
 * System.out.println() method prints the given string.
 * Java automatically coverts number to strings from output
 * 
 * Command-line input
 * String you type after the program name are available as args[0], args[1]...at run time
 * Q. How do we give an integer as command-line input ?
 * A. Need to call system method Integer.parseInth() to convert the string to integers
 * /
 */