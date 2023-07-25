
public class LargestArray {

	public static void main(String[] args) {
		int arr[] = {78,40,56,88,95};
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("Largest element in an array: "+max);
		

	}

}
