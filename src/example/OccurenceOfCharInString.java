package example;

import java.util.Scanner;

public class OccurenceOfCharInString {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = sc.nextLine();
	int count = 0;
	for(int i=0;i<str.length();i++)
	{
		for(int j=0;j<str.length();j++)
			if(i==j+1)
			str.charAt(j);
	        count++;
		   System.out.println("The occurence of "+str.charAt(i)+" is "+count);
	}
	
	}
}
