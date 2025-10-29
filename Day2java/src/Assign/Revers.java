package Assign;

import java.util.Scanner;

public class Revers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int rev=0;
		while( num != 0) {
			int n=num%10;
			
			rev=(rev*10)+n;
			
			num=num/10;
		}
		System.out.println(rev);

	}

}
