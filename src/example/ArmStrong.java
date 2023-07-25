package example;

import java.util.Scanner;

public class ArmStrong {
	public static void isArmStrong(int n)
	{
		int temp , digits =0, rem = 0, sum =0;
		temp = n;
		while(temp!=0)
		{
			rem = temp%10;
			sum += Math.pow(rem, digits);
			temp = temp/10;
			}
		if(temp==n)
			System.out.println(n+"is an armstrong");
		else
			System.out.println(n+"is not armstrong");
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		isArmStrong(num);
	}

}

