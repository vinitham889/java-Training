
public class SmallestArray {

	public static void main(String[] args) {
		int arr[] = {78,40,56,88,95};
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println("Largest element in an array: "+min);
		

	}
	}


