import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		int source [] = {10,20,30,40,50};
		int dest[] = new int[5];
		
		//copying source to dest
		for(int i=0;i<source.length;i++)
		{
			dest[i] = source[i];
		}
		// converting array to string
//        System.out.println(Arrays.toString(dest));
//        System.out.println(Arrays.toString(source));
		System.out.println("Original Array :");
		for(int i =0;i<source.length;i++)
		{
			System.out.print(source[i]+" ");
			
		}
		System.out.println();
		System.out.println("New Array");
		for(int i = 0;i<dest.length;i++)
		{
			System.out.print(dest[i]+" ");
			
		}
			
			
		
	}

}
