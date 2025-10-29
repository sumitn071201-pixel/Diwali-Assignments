package assignment;

import java.util.Scanner;

public class Allprime {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the n th number ");
		int n=sc.nextInt();
		
		for(int i=0 ;i<n;i++) {
			boolean isPrime=true;
			
			for( int j=2;j<i;j++)
			{
				if(i%j == 0)
				{
					isPrime=false ;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println(i);
			}
		}

	}

}
