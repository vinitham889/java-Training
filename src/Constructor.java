
public class Constructor {
	
	public Constructor()
	{
		System.out.println("Non-parameterized constructor");
	}
	public Constructor(int i)
	{
		System.out.println("single parameterized constructor");
		System.out.println("The value of i:"+i);
	}
	public Constructor(int i ,int j)
	{
		System.out.println("Double parameterized constructor");
		System.out.println("The value of i:"+i+"  and value of j:"+j);
		
		
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(10);
		Constructor obj2 = new Constructor(10,20);
		

	}

}
