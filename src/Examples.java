
public class Examples {

	public static void main(String[] args) {
		int a=5 , b=8, c= 5;
		if(a>b && a<c)
		{
			System.out.println("Both condition true");
		}
		else if(b > c || b<a)
		{
			System.out.println("Either of condition is true");
		}
		else if(!(c<=a))
		{
			System.out.println("True if condition is false and vice versa");
		}
		else
		{
			System.out.println("None of the condition True");
		}

	}

}
