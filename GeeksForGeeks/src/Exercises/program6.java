package Exercises;
/*Write a Java Program to Add two Complex Numbers.*/
/*Input:   1+2i
           4+5i*/

/*Output: 5+7i*/
public class program6 {
	
	int real , image;
	
	public program6(int real,int image) {
		this.real=real;
		this.image=image;
	}
	
	public void showC()
    {
        System.out.print(this.real + " +i " + this.image);
    }
		
	public static program6 add(program6 n1, program6 n2) {
		program6 res = new program6(0, 0);
		 res.real = n1.real + n2.real;
		 res.image = n1.image + n2.image;
		 return res;
		
	}
	
	public static void main(String[] args) {
		
		program6 c1 = new program6(4, 5);
		program6 c2 = new program6(10, 5);
        
		System.out.print("first Complex number: ");
        c1.showC();
         
        System.out.print("\nSecond Complex number: ");
        c2.showC();
        
        program6 res = add(c1, c2);
        System.out.println("\nAddition is :");
        
    
        res.showC();
        
	}
}