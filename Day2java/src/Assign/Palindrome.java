package Assign;

import java.util.Scanner;

public class Palindrome {
	
	public static int revers(int num)
	{
		int rev=0;
		while(num !=0)
		{
			int num1=num%10;
			rev=(rev*10)+num1;
			num=num/10;
		}
		return rev;
	}

	public static void main(String[] args) {
           
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		
		int pali=revers(num);
		if(pali==num)
		{
			System.out.println("number is palindrome "+num);
		}else {
		System.out.println("number is not palindrome "+num);
	     }
	}

}
