package Assign;

import java.util.Scanner;

public class Amstrong {
	
	
	public static int Am(int n) {
	    int original=n;
		int cnt=0;
		int sum=0;
		
		
		int temp=n;
		while(temp != 0)
		{
			cnt++;
			temp=temp/10;
		}
		
		temp=n;
			
		while(temp != 0)
			{
			int digit = temp % 10;
			sum = (int) (sum+ Math.pow(digit, cnt));
			temp=temp/10;
				
			}
		
		
		
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		
		int result=Am(num);
		if(result==num)
		{
			System.out.println("The number is amtrong number "+num);
		}
		else {
			System.out.println("The number is not amstrong number "+num);
		}
		
		
	}

}
