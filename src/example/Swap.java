package example;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp;
		System.out.println("Before swapping : "+a+" "+b);
//		temp = a;
//		a = b;
//		b = temp;
		
		//Without temp variable 
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping : "+a+" "+b);
		
		
		}

}
