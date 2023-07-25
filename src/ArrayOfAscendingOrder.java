
public class ArrayOfAscendingOrder {

	public static void main(String[] args) {
		int arr[] = {12,13,11,15,14};
		int temp =0;
		System.out.println("Elements  before sorting: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]>arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
				
			}
		}
		System.out.println();
		System.out.println("Elements after sorting in ascending order");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
