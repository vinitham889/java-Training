package example;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of array");
	    int n = sc.nextInt();
	    System.out.println("Enter the array");
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	arr[i] = sc.nextInt();
	    }
	    
		removeDuplicate(n,arr);
		sc.close();

	   }
	public static void removeDuplicate(int n,int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			System.out.print(arr[i]+" ");
		}
		System.out.print(arr[arr.length-1]);
		
	}

}
