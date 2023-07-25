
public class ExampleStatic {
	 int rollno;// instance variable
	String name;
	static String college = "KNSIT";
	
	ExampleStatic(int r , String n)
	{
		rollno=r;
		name = n;
		
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args) {
		 
		ExampleStatic obj1 = new ExampleStatic(123,"peter");
		ExampleStatic obj2 = new ExampleStatic(428,"Tom");
		obj1.display();
		obj2.display();
		

	}

}
