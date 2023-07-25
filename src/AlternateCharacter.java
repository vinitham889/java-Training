import java.util.Scanner;

public class AlternateCharacter {
	public static String mergeString(String str1 , String str2)
	{
		StringBuilder result = new StringBuilder();
		for(int i=0;i<str1.length() || i<str2.length();i++)
		{
			if(i<str1.length())
				result.append(str1.charAt(i));
			if(i<str2.length())
				result.append(str2.charAt(i));
		}
		System.out.println(result);
		return result.toString();
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string1:");
		String str1 = sc.nextLine();
		System.out.println("Enter string2:");
		String str2 = sc.nextLine();
		mergeString(str1,str2);
	}

}
