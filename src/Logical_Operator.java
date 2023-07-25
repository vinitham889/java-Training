
public class Logical_Operator {

	public static void main(String[] args) {
		 int a=5 , b=3, c= 8;

			    // Logical AND(&&) operator
			    System.out.println((a > b) && (c > a));  
			    System.out.println((a > b) && (c < a));  

			    // Logical OR(||) operator
			    System.out.println((a < b) || (c > a));  
			    System.out.println((a < b) || (c < a));  

			    // Logical Not (!)operator
			    System.out.println(!(a == b));  
			    System.out.println(!(c > b));  
			  }
			}