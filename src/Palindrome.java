import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String orginalStr = sc.nextLine();
		String reverseStr ="";
		for(int i=orginalStr.length()-1;i>=0;i--)
		{
			reverseStr = reverseStr + orginalStr.charAt(i);
		}
		System.out.println("Reverse string is:"+reverseStr);
		if(reverseStr.equals(orginalStr))
		{
			System.out.println("Given string is palindrome");
		}
		else
			System.out.println("Not a palindrome");

	}

}
